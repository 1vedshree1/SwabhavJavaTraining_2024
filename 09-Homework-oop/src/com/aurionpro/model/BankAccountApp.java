package com.aurionpro.model;

public class BankAccountApp {
	private long accountNumber;
	private String name;
	private AccountType type;
	private double balance;
	
	
	
	public BankAccountApp(long accountNumber2, String name2, AccountType type2, double balance2) {
		this.accountNumber=accountNumber2;
		this.name = name2;
		this.type = type2;
		this.balance = balance2;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
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
	
	public void deposit(double amount) {
		if(amount>0) {
		balance = balance+amount;
		System.out.println("Amount deposited successfully. Your balance is"+balance);
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			balance = balance-amount;
			System.out.println("Amount withdrawn successfully. Your balace is"+balance);
		}
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}


}
