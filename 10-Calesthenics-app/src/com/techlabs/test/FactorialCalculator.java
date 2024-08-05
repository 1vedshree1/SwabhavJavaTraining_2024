package com.techlabs.test;

import java.util.Scanner;

public class FactorialCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();
		
		int factorial=calculateFactorial(number);
		System.out.println("Factorial of Number is:"+factorial);
	}

	private static int calculateFactorial(int number) {
		int factorial =1;
		
		if(number==0)
			return 1;
		if(number<0)
			return -1;
		
		for(int i=1;i<=number;i++) {
			factorial = factorial*i;
		}
		
		return factorial;
	}

}
