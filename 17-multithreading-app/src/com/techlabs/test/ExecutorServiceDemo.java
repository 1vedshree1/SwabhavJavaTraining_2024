package com.techlabs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.techlabs.model.Task;

public class ExecutorServiceDemo {
	
	public static void main(String[] args) {
		
		int coreCount=Runtime.getRuntime().availableProcessors();
		//FixedThreadPool
//		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		//CachedThreadPool
//		ExecutorService service = Executors.newCachedThreadPool();
		//SingleThreadExecutor
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		
		System.out.println("available processors: "+coreCount);
		for(int i =0; i<100;i++) {
			service.execute(new Task());
		}
	}

}
