package com.aurionpro.Iterativeloop;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		int reminder =0;
		int reverse =0;
		int temp;
		while(number>0) {
			
			reminder = number%10;
			reverse = reverse*10+reminder;
			number = number/10;
			
			
		}
		
		System.out.println(reverse);
		
		
		
		 
			
		
	}

}
