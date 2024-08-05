package com.techlabs.exception;

public class AgeNotValidException extends RuntimeException {
	
	public String getMessage() {
		return "Age not valid. age must be less than 18.";
	}
	
	

}
