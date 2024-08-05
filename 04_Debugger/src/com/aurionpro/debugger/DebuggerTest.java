package com.aurionpro.debugger;

public class DebuggerTest {
	

	
public static void arithmeticOperations(int a, int b) {
		
		addition(a,b);
	}
	public static void comparisionOperations(int x, int y) {
		
		compare(x,y);
	}
			
		

	private static void compare(int x, int y) {
		if(x>y) {
		System.out.println(x+" is greater");	
		}
		else {
			System.out.println(y+" is greater");
		}
		
	}
	private static void addition(int a, int b) {
		int result = a+b;
		
		System.out.println("Addition is: "+result);
		
		
	}

	// Main method to test arithmeticOperations
	public static void main(String[] args) {
		int a = 20;
		int b = 7;
		int x =8;
		int y= 9;
		arithmeticOperations(a, b);
		comparisionOperations(x,y);
		
		
	}
	

}
