package idv.heimlich.springboot.entity.repository;

import idv.heimlich.springboot.entity.po.Userinf;
import idv.heimlich.springboot.entity.user.event.UserDeleteEvent;
import idv.heimlich.springboot.usecase.user.change.pwd.UserPwdChangedEvent;

public interface UserinfRepository {

	public Userinf findById(String bondid);

	public Userinf save(Userinf userInfo);

	public void updateChangePwd(UserPwdChangedEvent eventStore);

	public void deleteUser(UserDeleteEvent eventStore);

}
