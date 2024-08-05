package com.techlabs.model;

import java.util.concurrent.Callable;

public class NewTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int n = (int)Math.random();
		return n;
	}
	

}
