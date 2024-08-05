package com.techlabs.exception;

public class MinimumBalanceException extends RuntimeException {
	
	private double minBalance;

	public MinimumBalanceException(double minBalance) {
		super();
		this.minBalance = minBalance;
	}
	public String getMessage() {
		return "Your balance is less than minBalace";
	}
}
