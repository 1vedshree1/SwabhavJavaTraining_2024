package com.techlabs.model;

public class BankAccount {

	private long accountNumber;
	private String name;
	private double balance;
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

}
