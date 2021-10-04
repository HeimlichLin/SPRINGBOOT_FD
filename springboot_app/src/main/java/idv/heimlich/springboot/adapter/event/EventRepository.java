package idv.heimlich.springboot.adapter.event;

import idv.heimlich.springboot.usecase.common.event.EventStore;

public interface EventRepository {

	void save(EventStore evnet);

}
