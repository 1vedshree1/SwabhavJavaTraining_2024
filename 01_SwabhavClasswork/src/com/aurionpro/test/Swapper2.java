package com.aurionpro.test;

import java.util.Scanner;

public class Swapper2 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int number1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int number2 = sc.nextInt();
		
		number1 = number1+number2;
		number2 = number1-number2;
		number1 = number1-number2;
				
		System.out.println("swap of two number is");
		System.out.println("Number1 "+number1);
		System.out.println("Number2 "+number2);
		
	
		
	}

}
