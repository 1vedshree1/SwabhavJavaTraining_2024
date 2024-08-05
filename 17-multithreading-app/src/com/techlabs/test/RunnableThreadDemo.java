package com.techlabs.test;

import com.techlabs.model.RunnableThread;

public class RunnableThreadDemo {
	public static void main(String[] args) {
		  
		  RunnableThread thread = new  RunnableThread("Thread1");
		 
		  
		         for(int i = 5;i>0;i--) {
		   
		   System.out.println(Thread.currentThread().getName()+" "+i);
		   
		   try {
		    Thread.sleep(3000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		  }
		  
		 }


}
