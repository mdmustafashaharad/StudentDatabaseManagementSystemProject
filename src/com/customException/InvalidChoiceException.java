package com.customException;

/**
 * 
 * @author Mohammad Mustafa
 * @since 2022
 * 
 * Creating a Custom Exception
 *
 */

public class InvalidChoiceException extends RuntimeException {
	private String message;
	
	public InvalidChoiceException (String message) {
	this.message = message;	
	}
	@Override
	public String getMessage() {
		return message;
	}
}
