package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.DataEncapsulation;

public class DataEncapsulationTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 DataEncapsulation box1=new DataEncapsulation();
		
		System.out.println("Enter Height:");
		int height = sc.nextInt();
		box1.setHeight(height);
		System.out.println("Enter Width:");
		int width = sc.nextInt();
		box1.setWidth(height);
		System.out.println("Enter Depth:");
		int depth = sc.nextInt();
		box1.setDepth(depth);
		
		System.out.println("Area of box is: "+ box1.calculatearea());
		
		
		
	}

}
