package idv.heimlich.springboot.adapter.repository.mybatis;

import org.springframework.context.annotation.Primary;

import idv.heimlich.springboot.entity.mapper.UserinfMapper;
import idv.heimlich.springboot.entity.po.Userinf;
import idv.heimlich.springboot.entity.po.UserinfExample;
import idv.heimlich.springboot.entity.repository.UserinfRepository;
import idv.heimlich.springboot.entity.user.event.UserDeleteEvent;
import idv.heimlich.springboot.usecase.user.change.pwd.UserPwdChangedEvent;
import idv.heimlich.springboot.usecase.utils.TvEncryptUtils;
import lombok.AllArgsConstructor;

@Primary
@AllArgsConstructor
public class UserinfRepositoryImpl implements UserinfRepository {

	private final UserinfMapper userinfMapper;

	@Override
	public Userinf findById(String bondid) {
		return this.userinfMapper.selectByPrimaryKey(bondid);
	}

	@Override
	public Userinf save(Userinf userInfo) {
		final int updateByPrimaryKey = this.userinfMapper.updateByPrimaryKey(userInfo);
		return updateByPrimaryKey > 0 ? userInfo : null;
	}

	@Override
	public void updateChangePwd(UserPwdChangedEvent eventStore) {
		final Userinf userinf = new Userinf();
		userinf.setUserpw(TvEncryptUtils.encode(eventStore.getNewPwd()));
		final UserinfExample example = new UserinfExample();
		example.createCriteria().andUseridEqualTo(eventStore.getUserId());
		this.userinfMapper.updateByExampleSelective(userinf, example);

	}

	@Override
	public void deleteUser(UserDeleteEvent eventStore) {
		this.userinfMapper.deleteByPrimaryKey(eventStore.getUserId());
	}

}
