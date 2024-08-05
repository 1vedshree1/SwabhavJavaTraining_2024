package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter character");
		char vowel = sc.next().charAt(0); 
		
		
		if(vowel=='a'|| vowel=='e'|| vowel=='i'|| vowel=='o'|| vowel=='u') {
			
			System.out.println("Enter character is Vowel");
		}
		else {
			System.out.println("Enter charcter is not vowel");
		
		}
		
		
	}
}
