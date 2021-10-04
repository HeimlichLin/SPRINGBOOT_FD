package idv.heimlich.springboot.adapter.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import idv.heimlich.springboot.adapter.spring.security.jwt.JwtUtils;
import idv.heimlich.springboot.usecase.login.ILoginUserInput;
import idv.heimlich.springboot.usecase.port.LoginService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginServiceImpl implements LoginService {

	private final AuthenticationManager authenticationManager;

	private final JwtUtils jwtUtils;

	@Override
	public String login(ILoginUserInput input) {
		final Authentication authentication = this.authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(input.getUsername(), input.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		return this.jwtUtils.generateJwtToken(authentication);
	}

}
