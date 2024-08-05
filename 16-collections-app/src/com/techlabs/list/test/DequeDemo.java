package com.techlabs.list.test;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	 public static void main(String[] args)
	    {
	        Deque<Integer> deque  = new LinkedList<Integer>();

	       
	        deque.add(4);

	        
	        deque.addFirst(1);

	        
	        deque.addLast(5);

	        
	        deque.push(2);

	        
	        deque.offer(6);

	        
	        deque.offerFirst(3);

	        System.out.println(deque + "\n");

	        
	        deque.removeFirst();
	        deque.removeLast();
	        System.out.println("Deque after removing first and last: "+ deque);
	    }

}
