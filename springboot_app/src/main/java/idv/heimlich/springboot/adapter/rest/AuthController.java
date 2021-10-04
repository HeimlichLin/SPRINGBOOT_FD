package idv.heimlich.springboot.adapter.rest;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.heimlich.springboot.usecase.login.LoginUserInputDTO;
import idv.heimlich.springboot.usecase.login.LoginUserOutputDTO;
import idv.heimlich.springboot.usecase.login.LoginUsercase;
import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/public")
@AllArgsConstructor
public class AuthController {

	private final LoginUsercase loginUsercase;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginUserInputDTO loginUserInputDTO) {
		final LoginUserOutputDTO login = this.loginUsercase.login(loginUserInputDTO);
		return ResponseEntity.ok(login);
	}

}
