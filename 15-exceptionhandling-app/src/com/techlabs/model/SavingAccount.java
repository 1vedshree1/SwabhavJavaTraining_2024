package com.techlabs.model;

import java.util.Scanner;

import com.techlabs.exception.InsufficientBalanceException;
import com.techlabs.exception.MinimumBalanceException;

public class SavingAccount extends BankAccount {
	private double minBalance;

	public SavingAccount(long accountNumber, String name, double balance, double minBalance) {
		super(accountNumber, name, balance);
		this.minBalance = minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	public void debit(Scanner scanner,double minBalance) {
		System.out.println("Enter amount:");
		double amount = scanner.nextDouble();
		if(amount>getBalance()) {
			throw new InsufficientBalanceException(getBalance());
			
		}
		setBalance(getBalance()-amount);
		System.out.println("your blance is "+getBalance());
		if(getBalance()<minBalance) {
			
			throw new MinimumBalanceException(minBalance);
		}
		
		}
	public void credit(Scanner scanner, double minBalance) {
		System.out.println("Enter amount:");
		double amount = scanner.nextDouble();
		if(amount<0) {
			System.out.println("amount should be positive.");
			return;
		}
		if(getBalance()< minBalance) {
			setBalance(getBalance()+amount-30);
			System.out.println("Your balance is: "+getBalance());
			return;
		}
		setBalance(getBalance() -amount);
		System.out.println("Your balance is: "+getBalance());
	}

	@Override
	public String toString() {
		return "SavingAccount: minBalance=" + minBalance + ", AccountNumber=" + getAccountNumber() + ", Name="
				+ getName() + ", Balance=" + getBalance();
	}
	

}
