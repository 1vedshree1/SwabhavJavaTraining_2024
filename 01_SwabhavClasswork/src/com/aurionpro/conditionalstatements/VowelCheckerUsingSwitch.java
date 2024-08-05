package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class VowelCheckerUsingSwitch {

	public static void main(String[] args) {
		;
		Scanner sc = new Scanner(System.in);
		char vowel = sc.next().charAt(0); 
		
		switch(vowel) {
		
		case'a':
			System.out.println("Its Vowel");
			break;
		case 'e':
			System.out.println("Its Vowel");
		    break;
		case 'i':
			System.out.println("Its Vowel");
			break;
		case 'o':
			System.out.println("Its Vowel");
			break;
		case'u':
			System.out.println("Its Vowel");
			break;
		default:
			System.out.println("Not Vowel");
			
		
		
		
		}
		
		
	}
}
