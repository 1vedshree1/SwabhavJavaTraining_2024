package com.aurionpro.array;

import java.util.Scanner;

public class MaximumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int max=0;
		int temp;
		
		System.out.println("Enter elements: ");
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++) {
			
			temp = array[i];
			
			if(temp>max) {
				max= temp;
			}
			
		}
		
		System.out.println("Maximum element of an array is: "+max);
		
		
		

	}

}
