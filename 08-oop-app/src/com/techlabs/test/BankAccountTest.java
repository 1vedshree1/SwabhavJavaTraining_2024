package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.BankAccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		System.out.println("Enter information of first accountr:");
		System.out.println("Enter account number:");
		long accountNumber1 = sc.nextLong();
		account1.setAccountNumber(accountNumber1);
		sc.nextLine();
		System.out.println("Enter account holder name");
		String name1 = sc.nextLine();
		account1.setName(name1);
		System.out.println("Enter balance of account");
		double balance1 = sc.nextDouble();
		account1.setBalance(balance1);
		
		System.out.println("Enter information of second account");
		System.out.println("Enter account number:");
		long accountNumber2 = sc.nextLong();
		account2.setAccountNumber(accountNumber2);
		sc.nextLine();
		System.out.println("Enter account holder name");
		String name2 = sc.nextLine();
		account2.setName(name2);
		System.out.println("Enter balance of account");
		double balance2 = sc.nextDouble();
		account2.setBalance(balance2);
		
		System.out.println("Inforamtion of First Bank Account");
		System.out.println("Account Number:"+account1.getAccountNumber());
		System.out.println("Name of Account Holder: "+account1.getName());
		System.out.println("Balance:"+account1.getBalance());
		System.out.println();
		System.out.println("Information of Second Bank Account");
		System.out.println("Account Number:"+account2.getAccountNumber());
		System.out.println("Name of Account Holder: "+account2.getName());
		System.out.println("Balance:"+account2.getBalance());
		System.out.println();
		
		System.out.println("Select Operations");
		System.out.println("1.Check balance of Account1\n2.Check balance of Account2\n3.Deposit amount in Account1\n"
				+"4.Deposti amount in Account2 \n5.Withdraw amount from Account1\n6.Withdraw amount from Account2");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println(account1.getBalance());
			break;
		case 2:
			System.out.println(account1.getBalance());
			break;
		case 3:
			System.out.println("Enter amount to deposit:");
			double depositamount1 = sc.nextDouble();
			account1.deposit(depositamount1);
		case 4:
			System.out.println("Enter amount to deposit:");
			double depositamount2 = sc.nextInt();
			account2.deposit(depositamount2);
			break;
		
		case 5:
			System.out.println("Enter amount to withdraw:");
			double withdrawamount1 = sc.nextDouble();
			account1.withdraw(withdrawamount1);
			break;
		case 6:
			System.out.println("Enter amount to withdraw:");
			double withdrawamount2 = sc.nextDouble();
			account2.withdraw(withdrawamount2);
			break;
		default:
			System.exit(0);
			
		}
}
}