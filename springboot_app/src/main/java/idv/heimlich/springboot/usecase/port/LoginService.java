package idv.heimlich.springboot.usecase.port;

import idv.heimlich.springboot.usecase.login.ILoginUserInput;

public interface LoginService {

	String login(ILoginUserInput input);

}
