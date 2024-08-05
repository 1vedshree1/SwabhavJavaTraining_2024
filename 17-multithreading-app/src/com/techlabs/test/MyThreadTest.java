package com.techlabs.test;

import com.techlabs.model.MyThread;

public class MyThreadTest {
	
	public static void main(String[] args) {
		  
		  MyThread thread1 = new MyThread("Thread1");
		  MyThread thread2 = new MyThread("Thread2");
		  MyThread thread3 = new MyThread("Thread3");
		 
		  System.out.println(thread1.getThread().isAlive());
		  System.out.println(thread2.getThread().isAlive());
		  System.out.println(thread3.getThread().isAlive());
		  
		  thread1.getThread().setPriority(Thread.MAX_PRIORITY);
		  thread2.getThread().setPriority(Thread.MIN_PRIORITY);
		  thread3.getThread().setPriority(Thread.NORM_PRIORITY);
		         for(int i = 5;i>0;i--) {
		   
		   System.out.println(Thread.currentThread().getName()+" "+i);
		   
		   try {
		    Thread.sleep(1000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		  }
		         try {
				thread1.getThread().join();
					thread2.getThread().join();
					thread3.getThread().join();
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         
	         System.out.println(thread1.getThread().isAlive());
				  System.out.println(thread2.getThread().isAlive());
				  System.out.println(thread3.getThread().isAlive());
		  
		 }

	
	

}
