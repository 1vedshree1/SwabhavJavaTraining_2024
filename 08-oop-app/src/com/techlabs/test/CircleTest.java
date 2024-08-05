package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Circle;

public class CircleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		int radius = sc.nextInt();
		
		Circle c = new Circle(radius);
		
//		c.initialize(radius);
		c.display();
		System.out.println("Area of circle is: "+c.areacalculator());
		
		
		
		
	}

}
