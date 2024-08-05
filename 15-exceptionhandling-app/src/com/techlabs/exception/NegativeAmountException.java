package com.techlabs.exception;

public class NegativeAmountException extends RuntimeException {
	public String getMessage() {
		return "Amount should be positive";
		
	}

}
