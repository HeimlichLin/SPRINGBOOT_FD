package idv.heimlich.springboot.usecase.login;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import idv.heimlich.springboot.adapter.utils.YYYYMMDDHHMMSSUtils;
import idv.heimlich.springboot.entity.po.UserLog;
import idv.heimlich.springboot.entity.po.Userinf;
import idv.heimlich.springboot.entity.po.Warehse;
import idv.heimlich.springboot.entity.repository.FetchUserRepository;
import idv.heimlich.springboot.entity.repository.UserOnlineService;
import idv.heimlich.springboot.entity.repository.UserlogRepository;
import idv.heimlich.springboot.entity.repository.WarehseRepository;
import idv.heimlich.springboot.entity.user.UserEntity;
import idv.heimlich.springboot.usecase.login.LoginUserOutputDTO.LoginUserOutputDTOBuilder;
import idv.heimlich.springboot.usecase.port.LoginService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class LoginUsercaseImpl implements LoginUsercase {

	private final LoginService loginGateway;
	private final FetchUserRepository fetchUserRepository;
	private final UserlogRepository userlogRepository;
	private final WarehseRepository warehseRepository;
	private final UserOnlineService userOnlineService;

	@Override
	public LoginUserOutputDTO login(ILoginUserInput input) {
		try {
			final String token = this.loginGateway.login(input);

			final Warehse warehse = this.warehseRepository.findByBondId(input.getUserId());
			final UserEntity user = this.fetchUserRepository.fetch(input);
			final Userinf userinf = this.fetchUserRepository.fetchById(input);
			this.savelog(warehse, userinf);
			this.userOnlineService.addUser(userinf.getUserid());

			final LoginUserOutputDTOBuilder builder = LoginUserOutputDTO.builder();
			builder.accessToken(token);
			builder.user(user);
			builder.roles(Stream.of(user.getAuthority()).map(item -> item).collect(Collectors.toList()));
			builder.username(userinf.getUsername());
			builder.bondId(user.getBondId());
			builder.authority(user.getAuthority());
			return builder.build();
		} catch (final Exception e) {
			log.error("錯誤登入 userid:{}", input.getUserId(), e);
			final LoginUserOutputDTOBuilder builder = LoginUserOutputDTO.builder();
			return builder.build();
		}

	}

	private void savelog(Warehse warehse, Userinf userinf) {
		final UserLog log = new UserLog();
		log.setAuthority(userinf.getAuthid());
		log.setBondid(userinf.getUserid());
		log.setCustomsoffice(userinf.getUseroffice());
		log.setLogintime(YYYYMMDDHHMMSSUtils.getText());
		if (warehse != null) {
			log.setBondban(warehse.getBondban());
			log.setBondname(warehse.getBondname());
			log.setBondno(warehse.getBondno());
			log.setSpecialst(warehse.getSpecialst());
		}
		this.userlogRepository.save(log);
	}

}
