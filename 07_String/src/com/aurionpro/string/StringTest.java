package com.aurionpro.string;

public class StringTest {

	public static void main(String[] args) {
		
		String name1="AT";
		String name2="AT";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println(name1==name2);
		
		String name3 = "B";
		

		System.out.println(name3.hashCode());
		name3 = name3+"M";
		
		System.out.println(name3.hashCode());
				
		
	}
}
