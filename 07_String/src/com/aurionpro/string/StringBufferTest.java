package com.aurionpro.string;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer name1= new StringBuffer("vedshree");
		System.out.println(name1.hashCode());
		name1 = name1.append("Bhosale:");
		System.out.println(name1.hashCode());
		
	}

}
