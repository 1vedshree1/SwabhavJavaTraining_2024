package com.aurionpro.array;

import java.util.Scanner;

public class Elementschecker {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows of a array: ");
		int row = sc.nextInt();
		System.out.println("Enter column of a array: ");
		int column = sc.nextInt();
		
		int matrix[][] = new int[row][column];
		
		System.out.println("Enter Elements: ");
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<column;j++) {
				
				matrix[i][j]=sc.nextInt();
			}
						
		}
		
		System.out.println("Enter element that you want to find: ");
		int element = sc.nextInt();
		for(int i=0;i<row;i++) {
			
		for(int j=0;j<column;j++) {
			if(matrix[i][j]==element) {
				System.out.print("Element exist in array at row:"+(i+1)+ " column:"+(j+1));
			}
			
		}
		
	}
	

}
}
