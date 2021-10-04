package idv.heimlich.springboot.usecase.common.event;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public abstract class EventStore implements IEventStoree {

	Date createDate = new Date();

	private final boolean isAsync = false;

	@Override
	public String toEvent() {
		return this.getClass().getSimpleName();
	}

	@Override
	public Date toCreateDate() {
		return this.createDate;
	}

	@Override
	public Object toContet() {
		return this;
	}

	protected final String tokeyHelper(String... key) {
		return StringUtils.join(key, "-");
	}

	/**
	 * 是否分同步
	 * 
	 * @return
	 */
	public boolean isAsync() {
		return this.isAsync;
	}

}
