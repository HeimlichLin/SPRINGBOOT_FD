package idv.heimlich.springboot.adapter.event;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import idv.heimlich.springboot.entity.commons.exception.PclmsBusinessExecpetion;
import idv.heimlich.springboot.usecase.common.event.EventStore;
import idv.heimlich.springboot.usecase.common.event.IEventHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * 事件處理執行者
 */
@Slf4j
public class EventHanderHolder {

	private final Map<String, IEventHandler<?>> handersMap = new HashMap<>();

	void execute(EventStore evnet) {

		final Collection<IEventHandler<?>> values = this.handersMap.values();
		if (CollectionUtils.isEmpty(values)) {
			log.error("evnet:{} 查無事件監聽器", ToStringBuilder.reflectionToString(evnet));
		}

		final boolean async = evnet.isAsync();
		if (async) {
			log.info("async event:{}", evnet);
			new Thread() {
				@Override
				public void run() {
					EventHanderHolder.this.myExecute(evnet);
				};
			}.start();
		} else {
			log.info("sync event:{}", evnet);
			this.myExecute(evnet);
		}

	}

	private void myExecute(EventStore evnet) {
		final Collection<IEventHandler<?>> values = this.handersMap.values();
		values.forEach(handle -> {
			try {
				log.info("{} listen execute ", handle.getClass());
				final Method declaredMethod = handle.getClass().getDeclaredMethod("handle", evnet.getClass());
				declaredMethod.invoke(handle, evnet);
			} catch (final Exception e) {
				log.error("execute evnet:{}", ToStringBuilder.reflectionToString(evnet), e);
				throw new PclmsBusinessExecpetion("執行異常", e);
			}

		});
	}

	public void add(IEventHandler<?> eventHandler) {
		this.handersMap.put(eventHandler.getClass().getName(), eventHandler);
	}

}
