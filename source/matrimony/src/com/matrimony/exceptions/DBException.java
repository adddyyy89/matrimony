package com.matrimony.exceptions;

import java.io.Serializable;

public class DBException extends MatrimonyException implements Serializable {
	private static final long serialVersionUID = -537261994607756669L;

	public DBException() {
		super();
	}

	public DBException(String message) {
		super(message);
	}

	public DBException(String message, Throwable cause) {
		super(message, cause);
	}

	public DBException(Throwable cause) {
		super(cause);
	}

	protected DBException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
