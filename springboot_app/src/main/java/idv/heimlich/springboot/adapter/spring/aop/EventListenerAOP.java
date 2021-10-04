package idv.heimlich.springboot.adapter.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import idv.heimlich.springboot.usecase.common.event.EventPostService;
import idv.heimlich.springboot.usecase.common.event.EventStore;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
public class EventListenerAOP {

	final EventPostService eventPostService;

	public EventListenerAOP(EventPostService eventPostService) {
		super();
		this.eventPostService = eventPostService;
	}

	@Around("execution(* idv.heimlich.springboot.usecase..*.*UsecaseImpl.*(..))")
	public Object listen(ProceedingJoinPoint joinPoint) throws Throwable {
		final Object proceed = joinPoint.proceed();
		if (proceed != null) {
			if (proceed instanceof EventStore) {
				this.eventPostService.post((EventStore) proceed);
//				return StringUtils.EMPTY;
			}
		}
		return proceed;

	}

}
