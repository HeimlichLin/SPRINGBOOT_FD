package idv.heimlich.springboot.entity.repository;

import java.util.List;

import idv.heimlich.springboot.usecase.onlineuser.fetch.IFetchOnLineUserResult;

public interface UserOnlineService {

	public List<IFetchOnLineUserResult> getCurrentUsers();

	public void addUser(String userId);

	public void removeUser(String userId);

}
