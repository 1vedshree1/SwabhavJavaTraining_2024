package com.aurionpro.array;

import java.util.Scanner;

public class MatrixMultiplicationApp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of rows for matrix1: ");
		int row1 = scanner.nextInt();
		System.out.print("Enter number of columns for matrix2: ");
		int column1 = scanner.nextInt();
		System.out.print("Enter number of rows for matrix2: ");
		int row2 = scanner.nextInt();
		System.out.print("Enter number of columns for matrix2: ");
		int column2 = scanner.nextInt();
		
		int matrix1[][]= new int[row1][column1];
		int matrix2[][] = new int[row2][column2];
		int multiplication[][]= new int[row1][column2];
		//matrix1
		readMatrix1(scanner,row1,column1,matrix1);
		readMatrix2(scanner,row2,column2,matrix2);
		multiplication(row1,column1,column2,row2,multiplication,matrix1,matrix2);
			
	}

	private static void multiplication(int row1,int column1, int column2, int row2, int[][] multiplication, int[][] matrix1,
			int[][] matrix2) {
		
		for(int i =0;i<row1;i++) {
			for(int j =0; j<column2;j++) {
				for(int k=0;k<row2;k++)
				{  
					
					multiplication[i][j]+=matrix1[i][k]*matrix2[k][j];	
				}
				
			}
			
		}
		
		System.out.println("Multiplication of matrices is: ");
		for(int i =0;i<column1;i++) {
			for(int j =0; j<column2;j++) {
				
				
				System.out.print(multiplication[i][j]+"\t");
			}
			System.out.println("");
			
		}
	}

	private static void readMatrix2(Scanner scanner,int row2, int column2, int[][] matrix2) {
System.out.println("Matrix 2");
		
		for(int m=0; m<row2;m++) {
			for(int n=0;n<column2; n++) {
				System.out.println("Enter elements");
				matrix2[m][n]=scanner.nextInt();
			}
		}
		
		for(int m=0; m<row2;m++) {
			for(int n=0;n<column2; n++) {
				System.out.print(matrix2[m][n]+"\t");
				
			}
			
			System.out.println(" ");
		}
		
	}

	private static void readMatrix1(Scanner scanner,int row1, int column1, int[][] matrix1) {
		System.out.println("Matrix 1");
		for(int i=0; i<row1;i++) {
			for(int j=0;j<column1; j++) {
				System.out.println("Enter elements");
				matrix1[i][j]=scanner.nextInt();
			}
		}
		for(int i=0; i<row1;i++) {
			for(int j=0;j<column1; j++) {
				System.out.print(matrix1[i][j]+"\t");
			
			}
			System.out.println(" ");
		}
			
	}
	

}
