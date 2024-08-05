package com.techlabs.exception;

public class InsufficientBalanceException extends RuntimeException {
	
	 private double balance;
	 
	 
	 public InsufficientBalanceException(double balance) {
		super();
		this.balance = balance;
	}


	public String getMessage() {
		 return "Balance is insufficent. Your balance is "+ balance;
	 }
	

}
