package idv.heimlich.springboot.usecase.user.change.pwd;

import java.io.Serializable;

import idv.heimlich.springboot.usecase.common.event.EventStore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * 變更密碼事件
 */
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class UserPwdChangedEvent extends EventStore implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String oldPwd;
	private String newPwd;

	@Override
	public String toKey() {
		return this.tokeyHelper(this.userId);
	}

}
