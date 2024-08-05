package com.aurionpro.test;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principal Amount:");
		int principal = sc.nextInt();

		System.out.println("Enter Rate of Interest:");
		float rateOfinterest = sc.nextFloat();

		System.out.println("Enter number of years:");
		int years = sc.nextInt();

		double SI = (principal * rateOfinterest * years) / 100;

		System.out.println("Simple Interest is :" + SI);
	}

}
