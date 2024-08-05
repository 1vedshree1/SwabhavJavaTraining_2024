package com.aurionpro.array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of a array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter Elements: ");
		for(int i=0;i<size;i++) {
			
			array[i]= sc.nextInt();
						
		}
		
		for(int i=0; i<size;i++) {
			
			System.out.print(array[i]+"\t");
			
		}
		
	}

}
