package com.user_ragistration;

public class UserInputInvalidException extends Exception {
	enum ExceptionType{ INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL, INVALID_MOBILE_NUMBER, INVALID_PASSWORD}
	ExceptionType type;
	public UserInputInvalidException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
