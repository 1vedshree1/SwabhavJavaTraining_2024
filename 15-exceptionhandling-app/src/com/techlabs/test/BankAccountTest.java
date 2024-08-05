package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exception.InsufficientBalanceException;
import com.techlabs.exception.MinimumBalanceException;
import com.techlabs.exception.OverDraftLimitExceededException;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingAccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
        
		Scanner scanner= new Scanner(System.in);
		
		CurrentAccount current = new CurrentAccount(1,"vedshree",50000,1000);
		SavingAccount saving = new SavingAccount(2,"vedika",50000,500);
		System.out.println("Choose Account:");
		System.out.println("1.Saving Account \n2.Current Account");

		int choice =scanner.nextInt();
		switch(choice) {
		
		case 1: System.out.println(saving);
				displaySavingOperatios(scanner,saving,saving.getMinBalance());
				break;
		case 2: System.out.println(current);
				displayCurrentOperations(scanner,current,current.getBalance());
				break;
		}
		
		
		
		
	}
	

	private static void displaySavingOperatios(Scanner scanner, SavingAccount saving, double minBalance) {
		while(true) {
		System.out.println("Choose operations: \n1.Credit\n2.Debit\n3.Check Balance");
		int operation = scanner.nextInt();
		switch(operation) {
		
		case 1:saving.credit(scanner,minBalance);break;
		
		case 2: try {saving.debit(scanner,minBalance);break;
		}
		catch(MinimumBalanceException exception) {
			System.out.println(exception.getMessage());
		}
		catch(InsufficientBalanceException exception) {
			System.out.println(exception.getMessage());	
		}
		break;
		case 3:System.out.println("Your balance is: "+saving.getBalance());
				break;
		case 4: System.exit(0);
		
		
		}
		}
		
	}
	
	private static void displayCurrentOperations(Scanner scanner, CurrentAccount current, double balance) {
		while(true) {
		System.out.println("Choose operations: \n1.Credit\n2.Debit");
		int operation = scanner.nextInt();
		switch(operation) {
		
		case 1:current.credit(scanner, balance);break;
		case 2:try { current.debit(scanner);break;
		}
		catch(InsufficientBalanceException exception) {
			System.out.println(exception.getMessage());
		}
		catch(OverDraftLimitExceededException exception) {
			System.out.println(exception.getMessage());
		}
		break;
		case 3:System.out.println("Your balance is: "+current.getBalance());
			break;
		case 4: System.exit(0);;
		
		}
		}
		
	}
	

}
