package idv.heimlich.springboot.adapter.repository.inmemory;

import java.util.Arrays;
import java.util.List;

import idv.heimlich.springboot.adapter.utils.B64Hash.TvEncrypt;
import idv.heimlich.springboot.entity.menus.Menu;
import idv.heimlich.springboot.entity.menus.MenusInf;
import idv.heimlich.springboot.entity.po.Userinf;
import idv.heimlich.springboot.entity.repository.FetchUserRepository;
import idv.heimlich.springboot.entity.user.FunctionEntity;
import idv.heimlich.springboot.entity.user.UserEntity;
import idv.heimlich.springboot.entity.user.UserEntity.UserEntityBuilder;
import idv.heimlich.springboot.usecase.login.IUserKey;

public class FetchUserRepositoryInMen implements FetchUserRepository {

	@Override
	public Userinf fetchById(IUserKey dto) {
		return this.createUserinf("tv6407");
	}

	@Override
	public UserEntity fetch(IUserKey dto) {

		final MenusInf inf = new MenusInf();

		final Menu menu1 = new Menu();
		menu1.setMenuid("SYS");
		menu1.setMenuname("系統");

		inf.getMenu().add(menu1);

		final Menu fMenu = new Menu();
		fMenu.setMenuid("SYS-UserINF");
		fMenu.setMenuname("使用者資料維護");
		fMenu.setUrl("/userInfoMaintenance");

		menu1.getMenuList().add(fMenu);

		final UserEntityBuilder builder = UserEntity.builder();
		builder.authid("R").authority("R").bondId(dto.getUserId()).department("TV").functions(this.fetchFunctions("R"))
				.username("TV0001").menus(inf);

		return builder.build();
	}

	private Userinf createUserinf(String userId) {
		final Userinf userinf = new Userinf();
		userinf.setUserid(userId);
		userinf.setUserpw(TvEncrypt.encode(userId));
		userinf.setAuthid("R");
		userinf.setUsername("Lee");
		userinf.setUseroffice("TV");
		userinf.setStatus("1");
		userinf.setActivedate("20180505");
		userinf.setEnddate(null);
		userinf.setTel(null);
		userinf.setLastlogin("20180502095952");
		return userinf;
	}

	@Override
	public List<FunctionEntity> fetchFunctions(String authority) {
		return Arrays.asList();
	}

}
