package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.list.model.Account;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        
        while (true) {
            System.out.println("Choose Operation:");
            System.out.println("1. Create Account");
            System.out.println("2. Show Accounts");
            System.out.println("3. Show in Ascending Order by Balance");
            System.out.println("4. Show Account with Maximum Balance");
            System.out.println("5. Exit");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    readAccounts(scanner, accounts);
                    break;
                case 2:
                    printAccounts(accounts);
                    break;
                case 3:
                    SortByBalance(accounts);
                    printAccounts(accounts);
                    break;
                case 4:
                    showMaxBalanceAccount(accounts);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    break;
            }
        }
    }

    private static void readAccounts(Scanner scanner, List<Account> accounts) {
        scanner.nextLine(); 
        
        System.out.println("Enter Number of Accounts:");
        int numberOfAccounts = scanner.nextInt();
        
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Enter Account Number:");
            int accountNumber = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.println("Enter Name:");
            String name = scanner.nextLine();
            
            System.out.println("Enter Balance:");
            double balance = scanner.nextDouble();
            scanner.nextLine();
            
            accounts.add(new Account(accountNumber, name, balance));
        }
    }
    
    private static void SortByBalance(List<Account> accounts) {
        int n = accounts.size();
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (accounts.get(i).getBalance() > accounts.get(j).getBalance()) {
                    
                    Account temp = accounts.get(i);
                    accounts.set(i, accounts.get(j));
                    accounts.set(j, temp);
                }
            }
        }
    }
    
    private static void printAccounts(List<Account> accounts) {
        System.out.println("List Of Accounts (Ascending Order by Balance):");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    
    private static void showMaxBalanceAccount(List<Account> accounts) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts to display.");
            return;
        }
        
        
        SortByBalance(accounts);
        
        
        Account maxBalanceAccount = accounts.get(accounts.size() - 1);
        System.out.println("Account with Maximum Balance:");
        System.out.println(maxBalanceAccount);
    }
}
