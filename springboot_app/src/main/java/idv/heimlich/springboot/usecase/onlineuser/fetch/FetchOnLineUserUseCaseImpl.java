package idv.heimlich.springboot.usecase.onlineuser.fetch;

import java.util.List;

import idv.heimlich.springboot.entity.repository.UserOnlineService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FetchOnLineUserUseCaseImpl implements FetchOnLineUserUseCase {

	private final UserOnlineService userOnlineService;

	@Override
	public FetchOnLineUserUseCaseOutputDTO fetchOnLineUser() {
		final FetchOnLineUserUseCaseOutputDTO out = new FetchOnLineUserUseCaseOutputDTO();
		final List<IFetchOnLineUserResult> currentUsers = this.userOnlineService.getCurrentUsers();
		out.setList(currentUsers);
		return out;
	}

}
