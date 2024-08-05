package com.aurionpro.string;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		StringBuilder name1= new StringBuilder("vedshree");
		System.out.println(name1.hashCode());
		name1 = name1.append("Bhosale:");
		System.out.println(name1.hashCode());
		
	}


}
