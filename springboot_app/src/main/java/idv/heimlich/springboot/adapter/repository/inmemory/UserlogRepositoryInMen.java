package idv.heimlich.springboot.adapter.repository.inmemory;

import idv.heimlich.springboot.entity.po.UserLog;
import idv.heimlich.springboot.entity.repository.UserlogRepository;

public class UserlogRepositoryInMen implements UserlogRepository {

	CommonRepositoryInMem<UserLog> repository = new CommonRepositoryInMem<>();

	@Override
	public void save(UserLog log) {
		this.repository.saveOrUpdate(log);

	}

}
