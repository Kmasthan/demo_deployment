package com.junit_testing.exception;

public class CalculationsException extends RuntimeException {
	private final String message;

	public CalculationsException(String msg) {
		super();
		this.message = msg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
