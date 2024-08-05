package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.AccountType;
import com.aurionpro.model.BankAccountApp;



public class BankAccountAppTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of bank accounts:");
		int numberOfaccount =sc.nextInt();
		
		BankAccountApp accounts[] = new BankAccountApp[numberOfaccount];
		
		for(int i=0;i<accounts.length;i++) {
		System.out.println("Enter information of account:");
		System.out.println("Enter account number:");
		long accountNumber = sc.nextLong();
		
		sc.nextLine();
		System.out.println("Enter account holder name");
		String name = sc.nextLine();
		
		System.out.println("Enter account type:\n 1.Savings\n2.Current");
		int choice = sc.nextInt();
        AccountType type = null;
		switch(choice) {
		case 1:  type = AccountType.SAVINGS;break;
		
		case 2:  type = AccountType.CURRENT;break;
		default: System.out.println("Enter valid option");
		}

		
		System.out.println("Enter balance of account");
		double balance = sc.nextDouble();
		sc.nextLine();
		accounts[i]= new BankAccountApp(accountNumber,name, type,balance);
		}
		
		
		for(int i=0;i<accounts.length;i++) {
		System.out.println("Inforamtion of First Bank Account");
		System.out.println("Account Number:"+accounts[i].getAccountNumber());
		System.out.println("Name of Account Holder: "+accounts[i].getName());
		System.out.println("Accouny Type: "+accounts[i].getType());
		System.out.println("Balance:"+accounts[i].getBalance());
		System.out.println();
		}
		
		System.out.println("Select number on which account do you want to perform operations:");
		int number = sc.nextInt();
		System.out.println("Select Operations");
		System.out.println("1.Check balance of Account\n2.Deposit amount in Account1\n 3.Withdraw amount from Account \n4.exit");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println(accounts[number].getBalance());
			break;
	
		case 2:
			System.out.println("Enter amount to deposit:");
			double depositamount = sc.nextDouble();
			accounts[number].deposit(depositamount);
			break;
		
		
		case 3:
			System.out.println("Enter amount to withdraw:");
			double withdrawamount = sc.nextDouble();
			accounts[number].withdraw(withdrawamount);
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("choose correct option");;
			
		}
		double max=0;
		
		for(int i=0; i< accounts.length;i++) {
			if(accounts[i].getBalance()>max) {
				max=accounts[i].getBalance();	
			}
		
		}
		for(int i=0;i<accounts.length;i++) {
			if( accounts[i].getBalance()== max) {
				System.out.println(accounts[i].getName()+ " has maximum balance "+accounts[i].getBalance());
			}
		}
		
}

}
