package com.aurionpro.Iterativeloop;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number:");
	int number = sc.nextInt();
	int i=1;
	int count=0;
	
	while(i<=number) {
		
		if(number%i ==0) {
			
			count++;		
	}
		
		i++;
	
	}
	
	if(count==2)
	{
		System.out.println("It is prime number");
	}
	else {
	
	System.out.println("It is not prime number");
	}
	
	
}
}