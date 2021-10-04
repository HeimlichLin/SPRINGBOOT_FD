package idv.heimlich.springboot.adapter.spring.security.jwt;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import idv.heimlich.springboot.usecase.port.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
public class JwtUtils implements JwtService {

	private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

	@Value("${app.jwtSecret}")
	private String jwtSecret;

	@Value("${app.jwtExpirationMs}")
	private int jwtExpirationMs;

	public String generateJwtToken(Authentication authentication) {
		final User userPrincipal = (User) authentication.getPrincipal();
		return this.createToken(userPrincipal.getUsername(), this.jwtSecret, this.jwtExpirationMs);
	}

	/**
	 * 更新
	 * 
	 * @return
	 */
	public String refresh(String token) {
		return this.refresh(token, this.jwtSecret, this.jwtExpirationMs);
	}

	public Claims getBody(String token) {
		return Jwts.parser().setSigningKey(this.jwtSecret).parseClaimsJws(token).getBody();
	}

	public String getUserNameFromJwtToken(String token) {
		return this.getBody(token).getSubject();
	}

	public boolean validateJwtToken(String authToken) {
		return this.validateJwtToken(authToken, this.jwtSecret);
	}

	@Override
	public String createToken(String name, String jwtSecret, int jwtExpirationMs) {
		return Jwts.builder().setSubject((name)).setIssuedAt(new Date())
				.setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
				.signWith(SignatureAlgorithm.HS512, jwtSecret).compact();
	}

	@Override
	public String refresh(String token, String jwtSecret, int jwtExpirationMs) {
		String returnToken = token;
		final boolean isToken = this.validateJwtToken(token, jwtSecret);
		if (isToken) {
			final String userNameFromJwtToken = this.getUserNameFromJwtToken(token);
			returnToken = Jwts.builder().setSubject((userNameFromJwtToken)).setIssuedAt(new Date())
					.setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
					.signWith(SignatureAlgorithm.HS512, jwtSecret).compact();
		}
		return returnToken;
	}

	@Override
	public boolean validateJwtToken(String authToken, String jwtSecret) {
		try {
			Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
			return true;
		} catch (final SignatureException e) {
			logger.error("Invalid JWT signature: {}", e.getMessage());
		} catch (final MalformedJwtException e) {
			logger.error("Invalid JWT token: {}", e.getMessage());
		} catch (final ExpiredJwtException e) {
			logger.error("JWT token is expired: {}", e.getMessage());
		} catch (final UnsupportedJwtException e) {
			logger.error("JWT token is unsupported: {}", e.getMessage());
		} catch (final IllegalArgumentException e) {
			logger.error("JWT claims string is empty: {}", e.getMessage());
		}

		return false;
	}

}
