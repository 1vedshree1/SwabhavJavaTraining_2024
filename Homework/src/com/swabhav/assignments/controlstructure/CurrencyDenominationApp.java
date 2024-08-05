package com.swabhav.assignments.controlstructure;
import java.util.Scanner;

public class CurrencyDenominationApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int amount = sc.nextInt();
		
		if(amount<=50000 && amount%100==0) {
			System.out.println("Currency Dnomination is as follows: ");
			
			int notesOf2000 = amount/2000;
			amount = amount%2000;
			
			int notesOf500 = amount/500;
			amount = amount%500;
			
			int notesOf200 = amount/200;
			amount = amount%200;
			
			int notesOf100 = amount/100;
			
			
			System.out.println("Notes of 2000: "+notesOf2000);
            System.out.println("Notes of 500: "+notesOf500);
            System.out.println("Notes of 200: "+notesOf200);
            System.out.println("Notes of 100: "+notesOf100);
            
			}
		
		else {
			System.out.println("Value should be less than or equal to 50000 and multiple by 100");
		}	
		
	}

}
