package idv.heimlich.springboot.adapter.presenter;

import org.springframework.http.ResponseEntity;

import idv.heimlich.springboot.usecase.port.presenter.IRestResponse;
import idv.heimlich.springboot.usecase.port.presenter.RestCodes;

public interface RestPresenter {

	public ResponseEntity<? extends IRestResponse> presneter(RestCodes restCodes, Object out);

	public ResponseEntity<? extends IRestResponse> presneter(Object out);

	public ResponseEntity<? extends IRestResponse> presneterEmpty();

	public ResponseEntity<? extends IRestResponse> presneter(Throwable throwable);

	public ResponseEntity<? extends IRestResponse> presneter(RestCodes restCodes, String message, Object out);

}
