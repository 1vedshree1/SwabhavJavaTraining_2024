package com.aurionpro.array;

import java.util.Scanner;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int sum =0;
		System.out.println("Enter elements: ");
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
		}		
		
        
		
		for(int i=0; i<size;i++) {		
			sum +=array[i];
			
		}
		
		System.out.println("Sum of an Array is: "+sum);
		
		
			
		
		
	}
	
	
			

}
