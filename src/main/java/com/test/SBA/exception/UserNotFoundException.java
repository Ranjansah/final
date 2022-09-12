package com.test.SBA.exception;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String message)
	{
		super(message);
	}

}