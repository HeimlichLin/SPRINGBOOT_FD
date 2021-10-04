package idv.heimlich.springboot.usecase.common.event;

import java.util.Date;

public interface IEventStoree {

	public String toEvent();

	public Date toCreateDate();

	public Object toContet();

	public String toKey();

}
