package com.aurionpro.array;

import java.util.Scanner;

public class ArraySquareApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int numberOfElements = scanner.nextInt();
		
		int array[]=new int[numberOfElements];
		readArray(scanner,numberOfElements,array);
		printArray(numberOfElements,array);
		squareOfArray(numberOfElements,array);		
	}
		
	private static void squareOfArray(int numberOfElements, int[] array) {
		
		System.out.println("Square of an elements of an array: ");
		for(int i=0;i<numberOfElements;i++) {
			array[i]=array[i]*array[i];
			System.out.print(array[i]+"\t");
		}
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
