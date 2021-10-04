package idv.heimlich.springboot.entity.user;

import java.util.List;

import idv.heimlich.springboot.entity.menus.MenusInf;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntity {

	private String bondId;

	private List<FunctionEntity> functions;
	private String authid;
	private String username;
	private String department;
	private String authority;

	private MenusInf menus;

}
