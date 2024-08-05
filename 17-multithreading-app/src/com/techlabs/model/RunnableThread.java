package com.techlabs.model;

public class RunnableThread implements Runnable {
	
	private Thread thread;
	
	public RunnableThread(String name) {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
