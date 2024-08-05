package com.techlabs.model;

import java.util.Scanner;

import com.techlabs.exception.InsufficientBalanceException;

import com.techlabs.exception.OverDraftLimitExceededException;

public class CurrentAccount extends BankAccount{
	private double overDraftLimit;

	public CurrentAccount(long accountNumber, String name, double balance, double overDraftLimit) {
		super(accountNumber, name, balance);
		this.overDraftLimit = overDraftLimit;
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	public void debit(Scanner scanner) {
		System.out.println("Enter amount:");
		double amount = scanner.nextDouble();
		
		if(!checkOverDraftLimit(amount,getBalance())) {
			throw new OverDraftLimitExceededException(overDraftLimit);
			
		}
		else {
		setBalance(getBalance()-amount);
		System.out.println("Your balance is: "+getBalance());
		}
		}
	public boolean checkOverDraftLimit(double amount,double balance) {
		overDraftLimit = amount-balance;
		if(overDraftLimit>1000)
			return false;
		return true;		
		
	}
	public void credit(Scanner scanner, double minBalance) {
		System.out.println("Enter amount:");
		double amount = scanner.nextDouble();
		if(amount<0) {
			System.out.println("amount should be positive.");
			return;
		}
		
		setBalance(getBalance()+amount);
		System.out.println("Your balance is: "+getBalance());
	}

	@Override
	public String toString() {
		return "CurrentAccount: overDraftLimit=" + overDraftLimit + ", AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance();
	}

}
