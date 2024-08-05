package com.aurionpro.Iterativeloop;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		
		int i =1;
		int sum =0;
		
		while(i<number) {
			if(number%i==0) {
				sum = sum +i;
				
			}
			i++;
			
			
		}
		
		if(sum==number) {
			System.out.println("It is perfect Number");
			
		}
		
		
		
		
	}

}
