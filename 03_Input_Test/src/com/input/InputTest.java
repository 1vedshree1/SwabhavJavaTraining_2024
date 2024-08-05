package com.input;
import java.util.Scanner;

public class InputTest {
	
	String lname = "Bhosale";
	String fname = "Vedshree";
	String city = "Mumbai";
	long Pincode = 400706;
	short var = 250;
	double f = 3.444444d;
	float a = 2.4f;
	char name= 'a';
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		InputTest e = new InputTest();
		
		System.out.println("Lastname: "+ e.lname);
		System.out.println("Firstname: "+ e.fname);
		System.out.println("Cityname: "+ e.city);
		System.out.println("Pincode: "+ e.Pincode);
		
		
		
	}
	

}
