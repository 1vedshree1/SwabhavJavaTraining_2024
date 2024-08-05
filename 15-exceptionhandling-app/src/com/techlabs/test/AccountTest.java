package com.techlabs.test;
import java.util.Scanner;

import com.techlabs.exception.InsufficientBalanceException;
import com.techlabs.exception.NegativeAmountException;
import com.techlabs.model.Account;
public class AccountTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Account account = new Account(123, "vedshree",50000);
		System.out.println(account);
		while(true) {
		System.out.println("Choose Operation\n1.Deposit\n2.Withdraw\n3.exit");
		int choice = scanner.nextInt();
		
		switch(choice){
		case 1:System.out.println("Enter amount:");
		        try {
				double amount1 = scanner.nextDouble();
				account.credit(amount1);
				
				break;
		        }
		        catch(NegativeAmountException exception) {
					System.out.println(exception.getMessage());
				}
		        break;
		
		case 2:System.out.println("Enter amount:");
				try {
				double amount2 = scanner.nextDouble();
				account.debit(amount2);
				break;
				}
				catch(InsufficientBalanceException exception){
					System.out.println(exception.getMessage());	
				}
				catch(NegativeAmountException exception) {
					System.out.println(exception.getMessage());
				}
				break;
		case 3: System.exit(0);
		default:System.out.println("Choose valid operation");
		}
		}
	}	

}
