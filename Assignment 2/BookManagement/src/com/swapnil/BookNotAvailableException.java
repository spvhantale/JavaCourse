package com.swapnil;

public class BookNotAvailableException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookNotAvailableException(String message) {
		super(message);
	}
}
