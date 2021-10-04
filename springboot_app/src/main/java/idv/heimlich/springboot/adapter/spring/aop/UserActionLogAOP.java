package idv.heimlich.springboot.adapter.spring.aop;

import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import com.fasterxml.jackson.databind.ObjectMapper;

import idv.heimlich.springboot.adapter.presenter.RestBoundaryImpl;
import idv.heimlich.springboot.entity.po.UserAction;
import idv.heimlich.springboot.entity.repository.UserActionRepository;
import idv.heimlich.springboot.usecase.port.UserService;
import idv.heimlich.springboot.usecase.utils.YYYYMMDDUtils;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@RequiredArgsConstructor
public class UserActionLogAOP {

	private final ObjectMapper objectMapper;

	private final UserService userService;

	private final UserActionRepository userActionRepository;

	private final HttpServletRequest request;

	protected final SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");

	@Around("execution(* idv.heimlich.springboot.adapter.rest..*(..))")
	public Object listen(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("切入點類別 -> " + joinPoint.getTarget().getClass());
		log.info("切入點方法 -> " + joinPoint.getSignature().getName());

		final UserAction userAction = new UserAction();
		if (joinPoint.getArgs().length > 0) {
			final Object args = joinPoint.getArgs()[0];
			final String ps1 = this.objectMapper.writeValueAsString(args);
			userAction.setAttribute(StringUtils.substring(ps1, 0, 255));
			userAction.setBondNo(this.getValue(args, "bondNo", "bondno"));
			userAction.setDeclno(this.getValue(args, "declno", "declNo"));
			userAction.setRefbillno(this.getValue(args, "refbillNo", "refbillno"));
		}
		userAction.setStartdate(YYYYMMDDUtils.getText());
		userAction.setStarttime(this.sdf.format(new Date()));
		userAction.setUserId(this.userService.getCurrentUserId());
		userAction.setIp(this.request.getRemoteAddr());

		final MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		final Method method = signature.getMethod();
		userAction.setUrl(
				MessageFormat.format("{0}.{1}", joinPoint.getTarget().getClass().getSimpleName(), method.getName()));
		if (method.isAnnotationPresent(Operation.class)) {
			final Operation apiOperation = method.getAnnotation(Operation.class);
			userAction.setUrl(userAction.getUrl() + "【" + apiOperation.summary() + "】");
		}
		try {
			final Object proceed = joinPoint.proceed();
			userAction.setMessage(StringUtils.substring(RestBoundaryImpl.getMessage(), 0, 255));
			return proceed;
		} catch (final Exception e) {
			log.error("系統異常:", e);
			userAction.setMessage(StringUtils.substring(e.getMessage(), 0, 255));
			throw e;
		} finally {
			userAction.setEnddate(YYYYMMDDUtils.getText());
			userAction.setEndtime(this.sdf.format(new Date()));

			this.userActionRepository.save(userAction);
		}

	}

	private String getValue(Object object, String... pses) {
		for (final String ps : pses) {
			try {
				return BeanUtils.getProperty(object, ps);
			} catch (final Exception e) {
			}
		}
		return "";
	}

}
