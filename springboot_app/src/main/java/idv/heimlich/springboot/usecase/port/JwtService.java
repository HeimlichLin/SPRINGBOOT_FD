package idv.heimlich.springboot.usecase.port;

public interface JwtService {

	boolean validateJwtToken(String authToken, String jwtSecret);

	String createToken(String name, String jwtSecret, int expirationMs);

	String refresh(String token, String jwtSecret, int expirationMs);

}
