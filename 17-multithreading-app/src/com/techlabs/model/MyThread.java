package com.techlabs.model;

public class MyThread extends Thread{
	private Thread thread;
	public MyThread(String name) {
		super(name);
		thread = new Thread(this,name);
		
		thread.start();
	}
	public void run() {
		
		for(int i=5;i>0;i--) {
			
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}

}
