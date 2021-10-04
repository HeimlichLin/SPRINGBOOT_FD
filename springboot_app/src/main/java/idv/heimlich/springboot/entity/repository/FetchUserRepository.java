package idv.heimlich.springboot.entity.repository;

import java.util.List;

import idv.heimlich.springboot.entity.po.Userinf;
import idv.heimlich.springboot.entity.user.FunctionEntity;
import idv.heimlich.springboot.entity.user.UserEntity;
import idv.heimlich.springboot.usecase.login.IUserKey;

public interface FetchUserRepository {

	Userinf fetchById(IUserKey dto);

	UserEntity fetch(IUserKey dto);

	List<FunctionEntity> fetchFunctions(String authority);

}
