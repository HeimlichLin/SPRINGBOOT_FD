package idv.heimlich.springboot.adapter.presenter;

import java.util.function.Supplier;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

import idv.heimlich.springboot.entity.commons.exception.PclmsBusinessExecpetion;
import idv.heimlich.springboot.usecase.port.presenter.IRestResponse;
import idv.heimlich.springboot.usecase.port.presenter.RestBoundary;

public class RestBoundaryImpl implements RestBoundary {

	private final RestPresenter restPresenter;
	private static ThreadLocal<String> message = new ThreadLocal<>();
	final Logger logger = LoggerFactory.getLogger(RestBoundaryImpl.class);

	public RestBoundaryImpl(RestPresenter restPresenter) {
		super();
		this.restPresenter = restPresenter;
	}

	public static String getMessage() {
		final String string = StringUtils.defaultString(message.get());
		message.remove();
		return string;
	}

	@Override
	public ResponseEntity<? extends IRestResponse> presenter(Supplier<Object> input) {
		try {
			this.logger.info("{} execute", input);
			final Object object = input.get();
			return this.presenter(object);
		} catch (final PclmsBusinessExecpetion e) {
			message.set(e.getMessage());
			return this.presenterError(e);
		} catch (final Exception e) {
			throw e;
		}

	}

	// @Override
	private ResponseEntity<? extends IRestResponse> presenter(Object input) {
		return this.restPresenter.presneter(input);
	}

	// @Override
	@Override
	public ResponseEntity<? extends IRestResponse> presenterError(Throwable e) {
		return this.restPresenter.presneter(e);
	}

	@Override
	public ResponseEntity<? extends IRestResponse> presenter(Runnable runnable) {
		return this.presenter(() -> {
			runnable.run();
			return StringUtils.EMPTY;
		});
	}

}
