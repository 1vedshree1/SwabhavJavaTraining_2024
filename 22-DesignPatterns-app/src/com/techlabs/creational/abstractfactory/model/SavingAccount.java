package com.techlabs.creational.abstractfactory.model;

public class SavingAccount implements IAccount {
	
	private int accountNumber;
	private String name;
	private double balance;
	private double minBalance;
	

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

	public SavingAccount(int accountNumber, String name, double balance, double minBalance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.minBalance= minBalance;
	}

	@Override
	public void credit(double amount) {
		setBalance(getBalance()+amount);
		System.out.println(getBalance());
		
	}

	@Override
	public void debit(double amount) {
		if(amount>(balance-minBalance)) {
			System.out.println("Insufficient balance");
		    return;
		}
		setBalance(getBalance()-amount);
		System.out.println(getBalance());
		
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", minBalance=" + minBalance + "]";
	}


	
	}


