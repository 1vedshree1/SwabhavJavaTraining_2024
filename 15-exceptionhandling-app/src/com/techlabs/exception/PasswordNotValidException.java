package com.techlabs.exception;

public class PasswordNotValidException extends RuntimeException {
	private String password;

	public PasswordNotValidException(String password) {
		super();
		this.password = password;
	}
	public String getMessage() {
		return password+" password is not valid password.";
	}

}
