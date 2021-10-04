package idv.heimlich.springboot.entity.repository;

import java.util.List;

import idv.heimlich.springboot.entity.po.UserAction;
import idv.heimlich.springboot.usecase.useraction.fetch.FetchUserActionInputDTO;

public interface UserActionRepository {

	List<UserAction> findByQueryDTO(FetchUserActionInputDTO dto);

	void save(UserAction action);

}
