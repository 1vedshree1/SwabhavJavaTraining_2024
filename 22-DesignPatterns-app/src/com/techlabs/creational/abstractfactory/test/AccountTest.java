package com.techlabs.creational.abstractfactory.test;
import com.techlabs.creational.abstractfactory.model.IAccountFactory;
import com.techlabs.creational.abstractfactory.model.SavingAccount;
import com.techlabs.creational.abstractfactory.model.SavingAccountFactory;

import java.util.Scanner;

import com.techlabs.creational.abstractfactory.model.CurrentAccountFactory;
import com.techlabs.creational.abstractfactory.model.IAccount;
public class AccountTest {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Select Account Type:");
	        System.out.println("1. Saving Account");
	        System.out.println("2. Current Account");
	        System.out.print("Enter choice (1 or 2): ");
	        int choice = scanner.nextInt();

	        IAccountFactory factory = null;

	        switch (choice) {
	            case 1:
	                factory = new SavingAccountFactory();
	                break;
	            case 2:
	                factory = new CurrentAccountFactory();
	                break;
	            default:
	                System.out.println("Invalid choice");
	                System.exit(1);
	        }

	        IAccount account = factory.getAccount();
	       
            System.out.println(account);
            while(true) {
            System.out.println("Select Operation:");
	        System.out.println("1. Credit");
	        System.out.println("2. Debit");
	        System.out.print("Enter choice (1 or 2): ");
	        int operation = scanner.nextInt();
           
            switch(operation){
            case 1:
            	System.out.println("Enter amount:");
            	double creditAmount = scanner.nextDouble();
                account.credit(creditAmount);
                break;
            case 2:
            	System.out.println("Enter amount:");
            	double debitAmount = scanner.nextDouble();
                account.debit(debitAmount);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
            
            	
            }
            }

		
	}

}
