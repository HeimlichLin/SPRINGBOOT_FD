package idv.heimlich.springboot.usecase.onlineuser.fetch;

import java.util.List;

import lombok.Data;

@Data
public class FetchOnLineUserUseCaseOutputDTO {
	List<IFetchOnLineUserResult> list;

	public List<IFetchOnLineUserResult> getList() {
		return this.list;
	}

	public void setList(List<IFetchOnLineUserResult> currentUsers) {
		this.list = currentUsers;
	}

}
