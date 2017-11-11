package com.matrimony.exceptions;

import java.io.Serializable;

public class MatrimonyException extends Exception implements Serializable {

	private static final long serialVersionUID = 8940967358972088549L;

	public MatrimonyException() {
		super();
	}

	public MatrimonyException(String message) {
		super(message);
	}

	public MatrimonyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MatrimonyException(Throwable cause) {
		super(cause);
	}

	protected MatrimonyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}