package com.techlabs.behavioural.observer.model;

import java.util.ArrayList;
import java.util.List;



public class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	List<INotifier> notifier;
	
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifier = new ArrayList<INotifier>();
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
	public void registerNotifier(INotifier i) {
		notifier.add(i);
	}
	public List<INotifier> getNotifier() {
		return notifier;
	}
	public void setNotifier(List<INotifier> notifier) {
		this.notifier = notifier;
	}
	
	
	public void deposit(double amount) {
		
		setBalance(getBalance()+amount);
		notifyAllNotifiers(amount+" credited to your account. \nYour current balance is "+getBalance());
		
		
	}
	public void withdraw(double amount) {
		if(amount>getBalance()) {
			throw new InsufficientFundsException(getBalance());
		}
		setBalance(getBalance()+amount);
		notifyAllNotifiers(amount+" credited to your account. \nYour current balance is "+getBalance());
	}
	
	 private void notifyAllNotifiers(String message) {
	        for (INotifier notifiers : notifier) {
	            notifiers.notification(message);
	        }
	    }


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance +  "]";
	}
	
	
	

}
