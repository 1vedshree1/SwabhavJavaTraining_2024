package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class PositiveNegativeChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int number = sc.nextInt();

		if (number > 0) {
			System.out.println("Given number is Positve");
		} else if (number < 0) {
			System.out.println("Given number is Negative");
		} else {
			System.out.println("Given number is 0");
		}

	}

}
