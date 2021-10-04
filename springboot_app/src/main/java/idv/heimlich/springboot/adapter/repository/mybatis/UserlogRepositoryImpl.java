package idv.heimlich.springboot.adapter.repository.mybatis;

import org.springframework.context.annotation.Primary;

import idv.heimlich.springboot.entity.mapper.UserLogMapper;
import idv.heimlich.springboot.entity.po.UserLog;
import idv.heimlich.springboot.entity.repository.UserlogRepository;
import lombok.AllArgsConstructor;

@Primary
@AllArgsConstructor
public class UserlogRepositoryImpl implements UserlogRepository {

	private final UserLogMapper userLogMapper;

	@Override
	public void save(UserLog log) {
		this.userLogMapper.insert(log);
	}

}
