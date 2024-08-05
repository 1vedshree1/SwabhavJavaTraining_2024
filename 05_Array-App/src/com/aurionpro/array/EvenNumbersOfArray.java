package com.aurionpro.array;

import java.util.Scanner;

public class EvenNumbersOfArray {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of a array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter Elements: ");
		for(int i=0;i<size;i++) {
			
			array[i]= sc.nextInt();
						
		}
		
		System.out.print("Even Numbers in array are : ");
		
		for(int i=0; i<size;i++) {
			
			if(array[i]%2==0) {
				
				System.out.print(array[i]+"\t");
			}
			
		}
		
	}

}
