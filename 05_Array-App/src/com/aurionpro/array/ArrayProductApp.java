package com.aurionpro.array;

import java.util.Scanner;

public class ArrayProductApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int numberOfElements = scanner.nextInt();

		int array[] = new int[numberOfElements];
		readArray(scanner, numberOfElements, array);

		int[] prod = productExceptSelf(array, numberOfElements);

		printArray(numberOfElements, array);
		printProductArray(numberOfElements, prod);

		
	}

	private static void printArray(int numberOfElements, int array[]) {
		System.out.println("Elements of an array: ");
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	private static void printProductArray(int numberOfElements, int prod[]) {
		System.out.println("Product array (excluding self): ");
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print(prod[i] + "\t");
		}
		System.out.println();
	}

	public static void readArray(Scanner scanner, int numberOfElements, int array[]) {
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print("Enter " + (i + 1) + " element: ");
			array[i] = scanner.nextInt();
		}
	}

	public static int[] productExceptSelf(int[] nums, int n) {
		int[] prod = new int[n];

		int leftProduct = 1;
		for (int i = 0; i < n; i++) {
			prod[i] = leftProduct;
			leftProduct *= nums[i];
		}

		int rightProduct = 1;
		for (int i = n - 1; i >= 0; i--) {
			prod[i] *= rightProduct;
			rightProduct *= nums[i];
		}

		return prod;
	}
}
