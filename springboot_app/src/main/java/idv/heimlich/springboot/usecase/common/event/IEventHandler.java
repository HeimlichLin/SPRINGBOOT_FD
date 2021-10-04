package idv.heimlich.springboot.usecase.common.event;

/**
 * 事件觀察者
 */
public interface IEventHandler<T extends EventStore> {

	/**
	 * when ...[EventStore] ..then handle
	 * 
	 * @param eventStore
	 */
	void handle(T eventStore);

}
