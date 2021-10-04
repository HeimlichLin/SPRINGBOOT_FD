package idv.heimlich.springboot.adapter.event;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import idv.heimlich.springboot.usecase.common.event.IEventHandler;

@Configuration
public class EventPostCof {

	private final List<IEventHandler<?>> handles = new ArrayList<>();

	ApplicationContext ac;

	public EventPostCof(ApplicationContext ac) {
		final Map<String, IEventHandler> beansOfType = ac.getBeansOfType(IEventHandler.class);
		final Collection<IEventHandler> values = beansOfType.values();
		for (final IEventHandler<?> value : values) {
			this.handles.add(value);
		}

	}

	public List<IEventHandler<?>> fetch() {
		return this.handles;
	}

}
