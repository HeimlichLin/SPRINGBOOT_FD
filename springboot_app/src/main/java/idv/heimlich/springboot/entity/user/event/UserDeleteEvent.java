package idv.heimlich.springboot.entity.user.event;

import idv.heimlich.springboot.usecase.common.event.EventStore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class UserDeleteEvent extends EventStore {

	private String userId;// 帳號
	private String auth;// 腳色

	@Override
	public String toKey() {
		return this.tokeyHelper(this.userId);
	}

}
