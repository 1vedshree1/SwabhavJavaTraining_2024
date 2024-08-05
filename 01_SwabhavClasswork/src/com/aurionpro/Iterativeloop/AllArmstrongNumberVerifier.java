package com.aurionpro.Iterativeloop;

import java.util.Scanner;

public class AllArmstrongNumberVerifier {
	
	public static void main(String[] args) {
		
	
	
	System.out.println("Enter Number :");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int reminder =0;
	int sum = 0;
	int temp = number;
	int pow=0;
	
	while(number>0) {
		pow++;
		number = number/10;
	}
	
	number = temp;
	
	while(number>0) {
		
		reminder = number%10;
		sum = (int) (sum + Math.pow(reminder, pow));
		number = number/10;
		
	}
	
	System.out.println(sum);
	
	if(sum == temp) {
		System.out.println("It is Armstrong Number");
	}
	else {
		System.out.println("It is not armstrong Number");
	}
}


}
