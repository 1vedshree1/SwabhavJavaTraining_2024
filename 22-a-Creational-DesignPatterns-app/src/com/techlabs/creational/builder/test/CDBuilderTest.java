package com.techlabs.creational.builder.test;

import com.techlabs.creational.builder.model.CDBuilder;
import com.techlabs.creational.builder.model.CDType;

public class CDBuilderTest {
	public static void main(String args[]){  
		   CDBuilder cdBuilder=new CDBuilder();  
		   CDType cdType1=cdBuilder.buildSonyCD();  
		   cdType1.showItems();  
		  
		   CDType cdType2=cdBuilder.buildSamsungCD();  
		   cdType2.showItems();  
		 }  

}
