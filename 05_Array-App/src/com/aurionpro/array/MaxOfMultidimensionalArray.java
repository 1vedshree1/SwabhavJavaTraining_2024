package com.aurionpro.array;

import java.util.Scanner;

public class MaxOfMultidimensionalArray {
	
	
		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter rows of a array: ");
				int row = sc.nextInt();
				System.out.println("Enter column of a array: ");
				int column = sc.nextInt();
				
				int matrix[][] = new int[row][column];
				int max =0;
				System.out.println("Enter Elements: ");
				for(int i=0;i<row;i++) {
					
					for(int j=0;j<column;j++) {
						
						matrix[i][j]=sc.nextInt();
					}
								
				}
				
				System.out.println("Array");
				
				for(int i=0;i<row;i++) {
					
					for(int j=0;j<column;j++) {
						
						System.out.print(matrix[i][j]+"\t");
					}
					
					System.out.println(" ");
								
				}
				
				System.out.print("Peak element of Array is :");
				for(int i=0;i<row;i++) {
					
					for(int j=0;j<column;j++) {
						
						if(matrix[i][j]>max) {
							max= matrix[i][j];
						}
							
					}
					
								
				}
				
				System.out.println(max);
				
				
				
			}

}

