package idv.heimlich.springboot.adapter.repository.inmemory;

import idv.heimlich.springboot.usecase.port.UserService;

public class UserServiceInMen implements UserService {

	public final static String LOGIN_USERID = "AP6407";

	@Override
	public String getCurrentUserId() {
		return LOGIN_USERID;
	}

}
