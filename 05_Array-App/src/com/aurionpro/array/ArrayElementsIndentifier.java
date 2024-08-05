package com.aurionpro.array;

import java.util.Scanner;

public class ArrayElementsIndentifier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		int array[]= new int[size];
		System.out.println("Enter Elements: ");
		for(int i=0;i<size;i++) {
			array[i]= sc.nextInt();
			
		}
		
		System.out.println("Enter element that you want to find: ");
		int element = sc.nextInt();
		for(int i=0;i<size;i++) {
			if(array[i]==element) {
				System.out.println("Element exist in array at "+i+" index");
			}
			
		}
		
	

}
}
