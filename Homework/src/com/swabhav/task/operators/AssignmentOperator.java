package com.swabhav.task.operators;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt(); 

		int factorial = 1;

		
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}

		System.out.println("Factorial of " + number + " is: " + factorial);
	}
}
