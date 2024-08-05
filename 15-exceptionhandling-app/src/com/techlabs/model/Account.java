package com.techlabs.model;

import com.techlabs.exception.InsufficientBalanceException;
import com.techlabs.exception.NegativeAmountException;

public class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	private double amount;
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public void credit(double amount) {
	
		if(amount>0) {
			balance = balance+amount;
			System.out.println("Your balance is:"+ balance);
			return;
		}
		if(amount<0) {
			throw new NegativeAmountException();	
		}
			
	}
	public void debit(double amount) {
		if(amount>balance)
			throw new InsufficientBalanceException(balance);
		if(amount<0) 
			throw new NegativeAmountException();	
		
		balance = balance-amount;
		System.out.println("Your balance is:"+balance);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance+"]";
	}
	

}
