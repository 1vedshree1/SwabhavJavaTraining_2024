package com.techlabs.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class stringclass = Class.forName("java.lang.String");
		System.out.println(stringclass.getName());
		System.out.println(stringclass.getSimpleName());
		
		Method stringmethod[]= stringclass.getMethods();
		for(Method method:stringmethod) {
			
			System.out.println(method.getName()+"\t"+method.getParameterCount());
			
			Parameter parameters[]=method.getParameters();
			for(Parameter parameter:parameters) {
				System.out.println(parameter.getName()+parameter.getType());
			}
			
		}
		
		Constructor constructors[]=stringclass.getConstructors();
		for(Constructor constructor:constructors) {
			System.out.println(constructor.getName());
		}
			
	
		
		
		
	}

}
