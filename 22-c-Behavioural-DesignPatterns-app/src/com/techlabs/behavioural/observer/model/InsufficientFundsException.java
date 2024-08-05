package com.techlabs.behavioural.observer.model;

public class InsufficientFundsException extends RuntimeException{
	
 private double balance;
	 
	 
	 public InsufficientFundsException(double balance) {
		super();
		this.balance = balance;
	}


	public String getMessage() {
		 return "Balance is insufficent. Your balance is "+ balance;
	 }
	

}
