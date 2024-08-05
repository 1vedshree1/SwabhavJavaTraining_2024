package com.aurionpro.Iterativeloop;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		int i;
		int table;
		
		for(i=1;i<=10;i++) {
			
			table = number*i;
			System.out.println(table);
		
		}
		
	}
}
