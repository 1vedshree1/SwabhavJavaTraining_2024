package com.aurionpro.Iterativeloop;

import java.util.Scanner;

public class AdditionOfEvenNumbers {

	public static void main(String[] args) {
		System.out.println("Enter range of number: ");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int i =1;
		int sum=0;
		
		while(i<=range) {
			
		if(i%2==0) {
		sum = sum+i;
		
			}
		i++;
		}
		System.out.println("Sum of first given "+ range+" Even number is:"+sum);
		
	}
}
