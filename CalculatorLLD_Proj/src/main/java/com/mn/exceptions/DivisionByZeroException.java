package com.mn.exceptions;

@SuppressWarnings("serial")
public class DivisionByZeroException extends RuntimeException {
	public DivisionByZeroException(String message) {
		super(message);
	}

}
