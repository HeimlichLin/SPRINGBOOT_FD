package idv.heimlich.springboot.usecase.port.presenter;

import java.util.function.Supplier;

import org.springframework.http.ResponseEntity;

public interface RestBoundary {

	ResponseEntity<? extends IRestResponse> presenter(Runnable runnable);

	ResponseEntity<? extends IRestResponse> presenter(Supplier<Object> input);

	public ResponseEntity<? extends IRestResponse> presenterError(Throwable e);

}
