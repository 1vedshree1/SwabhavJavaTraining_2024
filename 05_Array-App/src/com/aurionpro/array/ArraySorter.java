package com.aurionpro.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of a array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int temp;
		System.out.println("Enter Elements: ");
		for(int i=0;i<size;i++) {
			
			array[i]= sc.nextInt();
						
		}
		
		for(int i=0;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
				
				if(array[j]>array[i]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
			
						
		}
		
		
		for(int i=0; i<size;i++) {
			
			System.out.print(array[i]+"\t");
			
		}
		
		
	

}
}