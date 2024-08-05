package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CurrentAccount current = new CurrentAccount(1, "vedshree", 50000, 1000);
		SavingAccount saving = new SavingAccount(2, "vedika", 50000, 5000);
		System.out.println("Enter Account Type:");
		System.out.println("1.Saving Account \n2.Current Account");
		int choice = scanner.nextInt();
		switch (choice) {

		case 1:
			System.out.println(saving);
			displaySavingOperatios(scanner, saving, saving.getBalance());
			break;
		case 2:
			System.out.println(current);
			displayCurrentOperations(scanner, current, current.getBalance());
			break;
		}
	}

	private static void displaySavingOperatios(Scanner scanner, SavingAccount saving, double balance) {
		while (true) {
			System.out.println("Choose operations: \n1.Credit\n2.Debit\n3.exit");
			int operation = scanner.nextInt();
			switch (operation) {
			case 1:
				saving.credit(scanner);
				break;
			case 2:
				saving.debit(scanner);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Enter valid choice");
			}
		}
	}

	private static void displayCurrentOperations(Scanner scanner, CurrentAccount current, double balance) {
		while (true) {
			System.out.println("Choose operations: \n1.Credit\n2.Debit\n3.exit");
			int operation = scanner.nextInt();
			switch (operation) {
			case 1:
				current.credit(scanner);
				break;
			case 2:
				current.debit(scanner);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Enter valid choice");

			}
		}
	}
}
