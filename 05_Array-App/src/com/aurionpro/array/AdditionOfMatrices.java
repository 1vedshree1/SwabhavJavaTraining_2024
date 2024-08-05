package com.aurionpro.array;

import java.util.Scanner;

public class AdditionOfMatrices {
	
	

		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter rows of a matrix1: ");
				int row = sc.nextInt();
				System.out.println("Enter column of a matrix1: ");
				int column = sc.nextInt();
				
				
				int matrix1[][] = new int[row][column];
				int matrix2[][]= new int[row][column];
				
				System.out.println("Enter Elements: ");
				for(int i=0;i<row;i++) {
					
					for(int j=0;j<column;j++) {
						
						matrix1[i][j]=sc.nextInt();
					}
								
				}
				
				System.out.println("matrix1");
				
				for(int i=0;i<row;i++) {
					
					for(int j=0;j<column;j++) {
						
						System.out.print(matrix1[i][j]+"\t");
					}
					
					System.out.println(" ");
								
				}
				
				System.out.println("Enter Elements: ");
				
				for(int m=0;m<row;m++) {
					
					
					for(int n=0;n<column;n++) {
						
						matrix2[m][n]=sc.nextInt();
					}
								
				}
				
				System.out.println("Matrix2");
				
				for(int m=0;m<row;m++) {
					
					for(int n=0;n<column;n++) {
						
						System.out.print(matrix2[m][n]+"\t");
					
					}
					
					System.out.println(" ");
								
				}
				
				System.out.println("Addition of two matrices is:");
				int matrix3[][] = new int[row][column];
				

				for(int i=0;i<row;i++) {
					
					for(int j=0;j<column;j++) {
						
						matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
						
						System.out.print(matrix3[i][j] + "\t");
					}
					
					System.out.println(" ");
								
				}
				
				
				
				
				
				
				
			}

	}

