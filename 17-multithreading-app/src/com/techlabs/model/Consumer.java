package com.techlabs.model;

public class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		int i = 0;
		while (i<10) {
			q.get();
		}

	}
}
