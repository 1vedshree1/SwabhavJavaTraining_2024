package com.aurionpro.array;

import java.util.Scanner;

public class SumOfRowsOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int column = sc.nextInt();
		
		int matrix[][]= new int[row][column];
		//Matrix
		for(int i=0; i<row;i++) {
			
			for(int j=0;j<column;j++) {
				System.out.println("Enter elements");
				matrix[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Matrix");
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+"\t");	
			}
			System.out.println(" ");
		}
		int sum =0;
		//Sum of each row
		for(int i=0; i<row;i++) {
			
			for(int j=0;j<column;j++) {
				
				sum = sum+matrix[i][j];
			}
			int noOfrow=i+1;
			System.out.println("Sum of "+noOfrow+" row is: "+sum);
			sum=0;
		}
		
		
	}

}
