package com.techlabs.test;

public class MainThreadTest {
	
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		
		thread.setName("MyThread");
		System.out.println(thread);
		
		for(int i=1;i<=5;i++) {
			
			System.out.println(thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
