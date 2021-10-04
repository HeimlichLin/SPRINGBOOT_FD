package idv.heimlich.springboot.usecase.onlineuser.fetch;

import idv.heimlich.springboot.entity.po.Userinf;

public class FetchOnLineUserResultDTO implements IFetchOnLineUserResult {

	private final Userinf userinf;

	private final String id;
	private final String loginTime;

	public FetchOnLineUserResultDTO(Userinf userinf, String id, String loginTime) {
		super();
		this.userinf = userinf;
		this.id = id;
		this.loginTime = loginTime;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getUseroffice() {
		return this.userinf.getUseroffice();
	}

	@Override
	public String getUsername() {
		return this.userinf.getUsername();
	}

	@Override
	public String getLoginTime() {
		return this.loginTime;
	}

	@Override
	public String getUserid() {
		return this.userinf.getUserid();
	}

}
