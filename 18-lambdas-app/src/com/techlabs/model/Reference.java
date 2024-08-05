package com.techlabs.model;

public class Reference {
	
	public Reference(){
		System.out.println("Inside consructor");
		
	}
	
	public static void staticPrint() {
		System.out.println("Inside static method");
	}
	
	public void print() {
		System.out.println("Inside non static method");
		
	}

}
