package com.techlabs.behavioural.strategy.test;

import com.techlabs.behavioural.strategy.model.AddOperation;
import com.techlabs.behavioural.strategy.model.OperationStrategy;
import com.techlabs.behavioural.strategy.model.multiplyOperation;

public class OperationTest {
	public static void main(String[] args) {
		OperationStrategy operation = new OperationStrategy(new AddOperation());
		
		
		operation.doOperation(10, 20);
		operation.setOperation(new multiplyOperation());
		operation.doOperation(10, 20);
		
		
	}

}
