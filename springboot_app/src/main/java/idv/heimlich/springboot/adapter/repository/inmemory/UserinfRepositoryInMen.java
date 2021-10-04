package idv.heimlich.springboot.adapter.repository.inmemory;

import idv.heimlich.springboot.adapter.utils.B64Hash.TvEncrypt;
import idv.heimlich.springboot.entity.po.Userinf;
import idv.heimlich.springboot.entity.repository.UserinfRepository;
import idv.heimlich.springboot.entity.user.event.UserDeleteEvent;
import idv.heimlich.springboot.usecase.user.change.pwd.UserPwdChangedEvent;

public class UserinfRepositoryInMen extends CommonRepositoryInMem<Userinf> implements UserinfRepository {

	public static final String MOCK_PASSWORD = "123433";

	public UserinfRepositoryInMen() {
		super.saveOrUpdate(this.mockUser(UserServiceInMen.LOGIN_USERID, MOCK_PASSWORD));
		super.saveOrUpdate(this.mockUser("tv6407", "ap6407"));
	}

	private Userinf mockUser(String userId, String pwd) {
		final Userinf userinf = new Userinf();
		userinf.setUserid(userId);
		userinf.setUserpw(TvEncrypt.encode(pwd));
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
	public Userinf findById(String bondid) {
		return super.findById(() -> bondid);
	}

	@Override
	public Userinf save(Userinf userInfo) {
		return super.saveOrUpdate(userInfo);
	}

	@Override
	public void updateChangePwd(UserPwdChangedEvent eventStore) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(UserDeleteEvent eventStore) {
		// TODO Auto-generated method stub

	}

}
