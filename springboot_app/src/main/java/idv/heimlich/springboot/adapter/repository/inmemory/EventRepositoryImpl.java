package idv.heimlich.springboot.adapter.repository.inmemory;

import idv.heimlich.springboot.adapter.event.EventRepository;
import idv.heimlich.springboot.usecase.common.event.EventStore;

public class EventRepositoryImpl implements EventRepository {

	@Override
	public void save(EventStore evnet) {
		// commonRepositoryInMem.saveOrUpdate(evnet);
	}

}
