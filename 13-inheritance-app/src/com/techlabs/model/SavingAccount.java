package com.techlabs.model;

import java.util.Scanner;

public class SavingAccount extends Account{
	
    private double minBalance; 
	public SavingAccount(int accountNumber, String name, double balance,double minBalance) {
		super(accountNumber, name, balance);
		this.minBalance = minBalance;
		
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	public void debit(Scanner scanner) {
		System.out.println("Enter amount");
		double amount = scanner.nextDouble();
		if(getBalance()<minBalance && amount<0) {
			System.out.println("Insufficient Balance or enterd amount is not valid");
			return;
		}
		setBalance(getBalance()-amount);
		System.out.println("Your balance is: "+getBalance());
	}
	public void credit(Scanner scanner) {
		System.out.println("Enter amount");
		double amount = scanner.nextDouble();
		if(amount<0) {
			System.out.println("Entered amount is invalid.");
		 	return;
		}
		setBalance(getBalance()+amount);
		System.out.println("Your balance is: "+getBalance());
	}
	@Override
	public String toString() {
		return "SavingAccount [ AccountNumber: " + getAccountNumber() + ", Name: "
				+ getName() + ", Balance: " + getBalance()+ "minBalance: " + minBalance +"]";
	}	
}
