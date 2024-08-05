package com.aurionpro.array;

import java.util.Scanner;

public class SecondLagrestOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int numberOfElements = scanner.nextInt();
		
		int array[]=new int[numberOfElements];
		readArray(scanner,numberOfElements,array);
		printArray(numberOfElements,array);
		Sort(numberOfElements,array);
		secondLargeElement(numberOfElements,array);
			
	}
		
	private static void secondLargeElement(int numberOfElements, int[] array) {
		for(int i =0;i<numberOfElements;i++) {
			if(array[i+1]<array[0]) {
				System.out.println(array[i+1]+" is Second largest number");
				return;
			}
			
		}
		System.out.println("No second largest number");
		
	}

	private static int[] Sort(int numberOfElements, int[] array) {
		int temp;
		for(int i=0;i<numberOfElements;i++) {
			for(int j=i+1;j<numberOfElements;j++) {
			if(array[i]<array[j])
			{
				temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			}
		}
		return array;
		
	}
	private static void printArray(int numberOfElements, int array[]) {
		
		System.out.println("Elements of an array: ");
		for(int i=0;i<numberOfElements;i++) {
	
			System.out.print(array[i]+"\t");			
		}
		System.out.println();
		
	}
	public static void readArray(Scanner scanner,int numberOfElements,int array[]) {
		
		for(int i=0;i<numberOfElements;i++) {
			System.out.print("Enter "+(i+1)+" element: ");
			array[i]=scanner.nextInt();
		}
		
	}

	
}
