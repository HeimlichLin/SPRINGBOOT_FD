package idv.heimlich.springboot.usecase.port.presenter;

public interface IRestResponse {

	/**
	 * 結果
	 */
	Object getResult();

	/**
	 * 處理結果
	 */
	String getRtnMsg();

	/**
	 * 處理結果代碼
	 */
	RestCodes getRtnCode();

}
