package idv.heimlich.springboot.usecase.onlineuser.fetch;

import idv.heimlich.springboot.usecase.port.presenter.IdKey;

public interface IFetchOnLineUserResult extends IdKey {

	String getUseroffice();

	String getUsername();

	String getLoginTime();

	String getUserid();
}
