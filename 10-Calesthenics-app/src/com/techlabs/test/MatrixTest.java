package com.techlabs.test;

import java.util.Scanner;

public class MatrixTest {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows of a array: ");
		int row = sc.nextInt();
		System.out.println("Enter column of a array: ");
		int column = sc.nextInt();
		
		int matrix[][] = new int[row][column];
		
		System.out.println("Enter Elements: ");
		createRows(row,matrix,column,sc);
		
		
		System.out.println("Array");
		
		printRows(row,matrix,column);
		
		
	}

	
private static void printRows(int row, int matrix[][],int column) {
	for(int rows=0;rows<row;rows++) {
		
		printColumns(matrix,column,rows);
		
		
		
		System.out.println(" ");
					
	}
		
	}


private static void printColumns(int matrix[][], int column, int rows) {
	for(int columns=0;columns<column;columns++) {
		
		System.out.print(matrix[rows][columns]+"\t");
	}
		
	}


private static void createRows(int row, int matrix[][],int column,Scanner sc) {
	for(int rows=0;rows<row;rows++) {
		readRowsElement(matrix,column,sc,rows);
			
	}
		
	}


private static void readRowsElement(int[][] matrix, int column, Scanner sc,int rows) {
	for(int j=0;j<column;j++) {
		
		matrix[rows][j]=sc.nextInt();
	}
		
	}

}
	
	
	


