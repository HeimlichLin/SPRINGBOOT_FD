package idv.heimlich.springboot.adapter.repository.mybatis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Primary;

import idv.heimlich.springboot.entity.commons.exception.PclmsBusinessExecpetion;
import idv.heimlich.springboot.entity.mapper.FuncinfMapper;
import idv.heimlich.springboot.entity.mapper.MenuinfMapper;
import idv.heimlich.springboot.entity.mapper.UserinfMapper;
import idv.heimlich.springboot.entity.mapper.WarehseMapper;
import idv.heimlich.springboot.entity.menus.Menu;
import idv.heimlich.springboot.entity.menus.MenusInf;
import idv.heimlich.springboot.entity.po.Funcinf;
import idv.heimlich.springboot.entity.po.Menuinf;
import idv.heimlich.springboot.entity.po.Userinf;
import idv.heimlich.springboot.entity.po.UserinfExample;
import idv.heimlich.springboot.entity.po.UserinfExample.Criteria;
import idv.heimlich.springboot.entity.repository.FetchUserRepository;
import idv.heimlich.springboot.entity.user.FunctionEntity;
import idv.heimlich.springboot.entity.user.UserEntity;
import idv.heimlich.springboot.entity.user.UserEntity.UserEntityBuilder;
import idv.heimlich.springboot.usecase.login.IUserKey;

@Primary
public class FetchUserRepositoryImpl implements FetchUserRepository {

	private final UserinfMapper userinfMapper;

	private final WarehseMapper warehseMapper;

	private final FuncinfMapper funcinfMapper;

	private final SqlSessionFactory sqlSessionFactory;

	private final MenuinfMapper menuinfMapper;

	public FetchUserRepositoryImpl(UserinfMapper userinfMapper, WarehseMapper warehseMapper,
			FuncinfMapper funcinfMapper, SqlSessionFactory sqlSessionFactory, MenuinfMapper menuinfMapper) {
		super();
		this.userinfMapper = userinfMapper;
		this.warehseMapper = warehseMapper;
		this.funcinfMapper = funcinfMapper;
		this.sqlSessionFactory = sqlSessionFactory;
		this.menuinfMapper = menuinfMapper;
	}

	@Override
	public UserEntity fetch(IUserKey dto) {

		final List<Userinf> userinfs = this.getUserInfo(dto);
		final Userinf userinf = this.checkPwd(dto, userinfs);

		String authority = userinf.getAuthid() != null ? userinf.getAuthid() : "";
		if ("Z".equals(userinf.getAuthid())) {
			authority = "W";
		}
		final List<FunctionEntity> fetchFunctions = this.fetchFunctions(authority);
		final UserEntityBuilder builder = UserEntity.builder();
		builder.authid(authority)//
				.bondId(userinf.getUserid())//
				.authority(authority)//
				.username(userinf.getUsername())//
				.department(userinf.getDepartment()).functions(fetchFunctions)//
				.menus(this.fetchMenu(userinf.getAuthid()));
		return builder.build();

	}

	private MenusInf fetchMenu(String authid) {
		final List<Menuinf> senuinfs = this.getMenuInfs(authid);
		final List<Menuinf> menusRootList = senuinfs.stream().filter(item -> StringUtils.equals(item.getRootid(), "-"))
				.collect(Collectors.toList());
		final List<Menuinf> menusList = senuinfs.stream().filter(item -> !StringUtils.equals(item.getRootid(), "-"))
				.collect(Collectors.toList());

		final Map<String, Menu> menumap = new LinkedHashMap<>();
		for (final Menuinf root : menusRootList) {
			final Menu menu = new Menu();
			menu.setMenuid(root.getMenuid());
			menu.setMenuname(root.getMenuname());
			menu.setUrl("-");
			menumap.put(root.getMenuid(), menu);
		}
		for (final Menuinf root : menusList) {
			final Menu orDefault = menumap.getOrDefault(root.getRootid(), null);
			if (orDefault != null) {
				final Menu menu = new Menu();
				menu.setMenuid(root.getMenuid());
				menu.setMenuname(root.getMenuname());
				menu.setUrl(root.getUrl());
				orDefault.getMenuList().add(menu);
			}
		}
		final MenusInf menusInf = new MenusInf();
		menusInf.setMenu(menumap.values().stream().collect(Collectors.toList()));
		return menusInf;
	}

	private List<Menuinf> getMenuInfs(String authid) {
		List<Menuinf> senuinfs = new ArrayList<Menuinf>();
		if (StringUtils.equals(authid, "R")) {
			senuinfs = this.menuinfMapper.selectByRoot();
		} else {
			senuinfs = this.menuinfMapper.selectByAuthid(authid);
		}
		return senuinfs;
	}

	private Userinf checkPwd(IUserKey dto, List<Userinf> userinfs) {
		if (CollectionUtils.isEmpty(userinfs)) {
			throw new PclmsBusinessExecpetion("帳號密碼錯誤");
		}
		final Userinf userinf = userinfs.get(0);
		return userinf;
	}

	private List<Userinf> getUserInfo(IUserKey dto) {
		final UserinfExample userinfExample = new UserinfExample();
		final Criteria createCriteria = userinfExample.createCriteria();

		createCriteria.andUseridEqualTo(dto.getUserId());

		final List<Userinf> userinfs = this.userinfMapper.selectByExample(userinfExample);
		return userinfs;
	}

	@Override
	public List<FunctionEntity> fetchFunctions(String authority) {

		final List<Funcinf> selectByAuthid = this.funcinfMapper.selectByAuthid(authority);

		return selectByAuthid.stream().map(item -> {

			final FunctionEntity function = new FunctionEntity();
			function.setCodename(item.getCodename());
			function.setFuncid(item.getFuncid());
			function.setFuncname(item.getFuncname());
			return function;
		}).collect(Collectors.toList());

	}

	@Override
	public Userinf fetchById(IUserKey dto) {
		final List<Userinf> userInfo = this.getUserInfo(dto);
		return CollectionUtils.isEmpty(userInfo) ? null : userInfo.get(0);
	}

}
