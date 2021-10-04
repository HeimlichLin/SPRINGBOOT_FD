package idv.heimlich.springboot.adapter.event;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;

import idv.heimlich.springboot.usecase.common.event.EventPostService;
import idv.heimlich.springboot.usecase.common.event.EventStore;
import idv.heimlich.springboot.usecase.common.event.IEventHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 事件發送
 */
@Slf4j
@RequiredArgsConstructor
public class EventPostServiceImpl implements EventPostService {

	private final Map<String, EventHanderHolder> objectMap = new HashMap<String, EventHanderHolder>();

	final EventPostCof eventPostCof;

	final EventRepository eventRepository;

	@PostConstruct
	public void init() {
		this.eventPostCof.fetch().forEach(this::register);
	}

	/**
	 * 註冊監聽器
	 * 
	 * @param evnet
	 */
	@Override
	public void register(IEventHandler<?> evnet) {
		final Method[] methods = evnet.getClass().getMethods();
		for (final Method method : methods) {
			if (StringUtils.equals(method.getName(), "handle")) {
				this.registerMethod(evnet, method);
			}
		}
	}

	private void registerMethod(IEventHandler<?> evnet, Method method) {
		final Class<?>[] parameterTypes = method.getParameterTypes();
		if (parameterTypes.length >= 1) {
			final Class<?> class1 = method.getParameterTypes()[0];
			if (EventStore.class.isAssignableFrom(class1) && !class1.getName().equals(EventStore.class.getName())) {
				final EventHanderHolder orDefault = this.objectMap.getOrDefault(class1.getName(),
						new EventHanderHolder());
				orDefault.add(evnet);
				log.info("register:{}", class1.getName());
				this.objectMap.put(class1.getName(), orDefault);
			}

		}
	}

	/**
	 * 發送
	 */
	@Override
	public void post(EventStore evnet) {
		log.info("post evnet:{}", evnet);
		this.eventRepository.save(evnet);
		final String name = evnet.getClass().getName();
		final EventHanderHolder eventHanderHolder = this.objectMap.getOrDefault(name, new EventHanderHolder());
		eventHanderHolder.execute(evnet);

	}

}
