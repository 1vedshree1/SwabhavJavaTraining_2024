package com.techlabs.model;

public class Demo {
	private int a=1;
	static private int b=1;
	private int c=1;
	
	public void display() {
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
	}
	
	public static void increment() {
//		a++;
		b++;
//		c++;
	}
	static
	{
	System.out.println("Everyone");
	}
	static {
		System.out.println("me");
	}
}
