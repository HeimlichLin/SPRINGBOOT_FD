package idv.heimlich.springboot.usecase.login;

import java.util.List;

import idv.heimlich.springboot.entity.user.UserEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@EqualsAndHashCode
@Getter
public class LoginUserOutputDTO {

	private final String accessToken;// token
	private final String tokenType = "Bearer";
	private final String username;// 顯示名稱
	private final List<String> roles;// 腳色
	private final UserEntity user;// 使用者
	private final String email;
	private final String bondId;
	private final String tempType;
	private final String authority;

}
