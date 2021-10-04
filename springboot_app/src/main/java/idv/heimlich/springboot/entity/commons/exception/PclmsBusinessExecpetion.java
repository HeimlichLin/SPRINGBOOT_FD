package idv.heimlich.springboot.entity.commons.exception;

import java.text.MessageFormat;

public class PclmsBusinessExecpetion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PclmsBusinessExecpetion(String pattern, Object... arguments) {
		super(MessageFormat.format(pattern, arguments));
	}

	public PclmsBusinessExecpetion(String string, Throwable throwable) {
		super(string, throwable);
	}

}
