package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class EvenOddNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		
		if(number%2==0){
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
		
		
	}

}
