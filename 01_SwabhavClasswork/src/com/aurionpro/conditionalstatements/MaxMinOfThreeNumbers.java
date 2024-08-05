package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class MaxMinOfThreeNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int number1 = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int number2 = sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int number3 = sc.nextInt();
		
		if(number1>number2 && number1>number3)	{
			System.out.println(number1+" is greater");
		}
		else if(number2>number1 && number2>number3) {
			System.out.println(number2+" is greater");
			
		}
		else {
			System.out.println(number3+" is greater");
		}
	}

}
