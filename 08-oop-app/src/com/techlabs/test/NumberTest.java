package com.techlabs.test;
import com.techlabs.model.Number;
import java.util.Scanner;

public class NumberTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Number number1 = new Number(10);
		Number number2 = new Number(20);
		
		System.out.println("Before Swapping:");
		
		System.out.println("number1:"+number1.getNumber()+"number2:"+number2.getNumber());
		
		swap(number1,number2);
		
		System.out.println("After Swapping:");
		System.out.println("number1:"+number1.getNumber()+"number2:"+number2.getNumber());
		
		
		
		
		
		
	}

	private static void swap(Number number1, Number number2) {
		int temp;
		temp = number1.getNumber();
		number1.setNumber(number2.getNumber());
		number2.setNumber(temp);
		
	}

	
}
