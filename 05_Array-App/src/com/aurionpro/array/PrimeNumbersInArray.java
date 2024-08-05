package com.aurionpro.array;

import java.util.Scanner;

public class PrimeNumbersInArray {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of a array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int count = 0;
		System.out.println("Enter Elements: ");
		for(int i=0;i<size;i++) {
			
			array[i]= sc.nextInt();
						
		}
		
		for(int i=0; i<size;i++) {
			boolean isprime =true;
			
			for(int j=2;j<size;j++) {
			
			if(array[i]%j==0) {
				
				isprime = false;
				break;
			}
			
			}
			if(isprime) {

	            System.out.println(array[i] + " is the prime numbers in the array ");
			}	
		}
		
		
		
	}

}
