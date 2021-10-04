package idv.heimlich.springboot.usecase.common.event;

/**
 * 事件發送服務
 */
public interface EventPostService {

	/**
	 * 註冊
	 * 
	 * @param evnet
	 */
	public void register(IEventHandler<?> evnet);

	/**
	 * 發送
	 * 
	 * @param evnet
	 */
	public void post(EventStore evnet);

}
