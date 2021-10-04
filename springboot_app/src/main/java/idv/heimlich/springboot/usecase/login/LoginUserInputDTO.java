package idv.heimlich.springboot.usecase.login;

import javax.validation.constraints.NotBlank;

public class LoginUserInputDTO implements ILoginUserInput {

	@NotBlank
	private String username;

	@NotBlank
	private String password;

	@Override
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getUserId() {
		return this.username;
	}

}
