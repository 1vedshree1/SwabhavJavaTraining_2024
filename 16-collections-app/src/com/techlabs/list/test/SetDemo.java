package com.techlabs.list.test;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	


	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		System.out.println(set1.isEmpty());
		set1.add(1);
		set1.add(3);
		set1.add(2);
		System.out.println(set1);
		System.out.println("hashcode of set1"+set1.hashCode());
		
		
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		System.out.println(set2);
		
		System.out.println("After adding set2 into set1:");
		set1.addAll(set2);
		System.out.println(set1);
		
		TreeSet<String> set3 = new TreeSet<String>();
		set3.add("Banana");
		set3.add("Cherry");
		set3.add("Apple");
		System.out.println("Treeset");
		System.out.println(set3);
		
			
		
	
	}
}



