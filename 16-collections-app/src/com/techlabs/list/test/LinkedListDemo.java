package com.techlabs.list.test;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.addFirst(1);
		list.addLast(4);
		
		for(Integer lists:list) {
			System.out.println(lists);
		}
		System.out.println(list.element());
	}

}
