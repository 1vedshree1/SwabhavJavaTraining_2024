package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class MaxMinOfTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int number1 = sc.nextInt();

		System.out.println("Enter Second Number");
		int number2 = sc.nextInt();

		if (number1 > number2) {

			System.out.println(number1 + " is maximum");
		} else {
			System.out.println(number2 + " is maximu");
		}

	}
}
