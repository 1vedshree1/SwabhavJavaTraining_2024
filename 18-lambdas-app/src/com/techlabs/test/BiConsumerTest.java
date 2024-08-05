package com.techlabs.test;

import java.util.function.BiConsumer;

public class BiConsumerTest {
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> biconsumer =(Integer number1, Integer number2)-> System.out.println("Addition of two number is: "+(number1+number2));
		biconsumer.accept(5, 6);
	}

}
