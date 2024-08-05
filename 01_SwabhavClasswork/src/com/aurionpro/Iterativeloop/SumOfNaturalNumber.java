package com.aurionpro.Iterativeloop;

import java.util.Scanner;

public class SumOfNaturalNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of number:");
		int range = sc.nextInt();
		int i=1;
		int sum=0;
		
		while(i<=range) {
			
			sum = sum+i;
			
			i++;
			
			
			
			
			
		}
		
		System.out.println("Sumof first given "+ range+" Natural number is:"+sum);
		
		
		
	}
}
