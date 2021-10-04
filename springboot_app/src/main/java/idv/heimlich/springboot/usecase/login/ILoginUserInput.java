package idv.heimlich.springboot.usecase.login;

public interface ILoginUserInput extends IUserKey {

	public String getUsername();

	public String getPassword();

	@Override
	default String getUserId() {
		return this.getUsername();
	}

}
