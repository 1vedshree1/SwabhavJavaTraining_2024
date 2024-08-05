package com.techlabs.model;

import java.util.Scanner;

public class CurrentAccount extends Account {
	private double overDraftLimit;

	public CurrentAccount(int accountNumber, String name, double balance, double overDraftLimit) {
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

		if (!checkOverDraftLimit(amount)) {
			System.out.println("overdraft limit is exceeded");
			return;
		}

		setBalance(getBalance() - amount);

	}

	public boolean checkOverDraftLimit(double amount) {
		overDraftLimit = amount - getBalance();
		if (overDraftLimit > 1000)
			return false;
		return true;

	}

	public void credit(Scanner scanner) {
		System.out.println("Enter amount:");
		double amount = scanner.nextDouble();
		if (amount < 0) {
			System.out.println("amount should be positive.");
			return;
		}

		setBalance(getBalance() + amount);
		System.out.println("Your balance is: " + getBalance());
	}

	@Override
	public String toString() {
		return "CurrentAccount [ AccountNumber:" + getAccountNumber() + ", Name: " + getName() + ", Balance: "
				+ getBalance() + "overDraftLimit=" + overDraftLimit + "]";
	}

}
