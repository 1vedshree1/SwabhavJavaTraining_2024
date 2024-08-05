package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class SeasonIdentifier {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number of month: ");
		
		int monthNumber = sc.nextInt();
		
		switch(monthNumber) {
		
		case 2:
		case 3:
		case 4:
		case 5: System.out.println("Its Summer Season"); break;
		case 6:
		case 7:
		case 8:
		case 9: System.out.println("Its Monsoon Season"); break;
		case 10:
		case 11:
		case 12:
		case 1: System.out.println("Its Winter Season"); break;
		default: System.out.println("check if month number again");
		}
		
	}
	
	
	

}
