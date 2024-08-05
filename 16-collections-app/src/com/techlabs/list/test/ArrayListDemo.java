package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println(names.size());
		System.out.println(names);
		names.add("vedshree");
		names.add("Rishika");
		names.add("Shruti");
		names.add("Bhargavi");
		System.out.println(names);
		System.out.println(names.size());
		
		//Converting Array to String. 
		String[] array={"Java","Python","PHP","C++"};  
		System.out.println("Printing Array: "+Arrays.toString(array));   
		List<String> list=new ArrayList<String>();  
		for(String lang:array){  
		list.add(lang);  
		}  
		System.out.println("Printing List: "+list);  
		list.add(1,"C");
		System.out.println("Printing List: "+list);
	}

}
