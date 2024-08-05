package com.aurionpro.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int size = sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter elements in sorted manner");
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
			
		}
		Arrays.sort(array);
		System.out.println("Sorted Array:");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+"\t");
		
		}
		System.out.println("");
		squareOfArray(array,size);
		System.out.println("Squares of elements of sorted array");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+"\t");
		
		}
	}

	public static void squareOfArray(int x[],int size) {
		
		
		for(int i=0; i<size;i++) {
			
				x[i]=x[i]*x[i];
				
			}
			
		
	}
}
