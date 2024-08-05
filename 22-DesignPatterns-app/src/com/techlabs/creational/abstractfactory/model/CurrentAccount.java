package com.techlabs.creational.abstractfactory.model;

public class CurrentAccount implements IAccount{

	private int accountNumber;
	private String name;
	private double balance;
	private double overDraftLimit;
	
	public CurrentAccount(int accountNumber, String name, double balance, double overDraftLimit) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
	}


	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
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
	public void credit(double amount) {
		if(amount>(balance+overDraftLimit)) {
			System.out.println("Over Draft Limit is crossed.");
		    return;
		}
		setBalance(getBalance()+amount);
		System.out.println(getBalance());
		
	}

	@Override
	public void debit(double amount) {
		setBalance(getBalance()-amount);
		System.out.println(getBalance());
		
	}


}
