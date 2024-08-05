package com.techlabs.model;

public class BaseClass {
	
	public void display() {
		System.out.println("inside base");
	}

}
 class Derived1 extends BaseClass{
	public void display() {
		System.out.println("inside derived1");
		
	}
	
}
 class Derived2 extends BaseClass{
	 public void display() {
			System.out.println("inside derived2");
			
		}
		
	 
 }

