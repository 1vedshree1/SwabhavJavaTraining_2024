package com.techlabs.structural.adapter.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.techlabs.structural.adapter.model.Buiscuit;
import com.techlabs.structural.adapter.model.Hat;
import com.techlabs.structural.adapter.model.HatAdapter;
import com.techlabs.structural.adapter.model.IItems;


public class ShoppingCart {
	
	
	public static void main(String[] args) {
		List<IItems> cartItems = new ArrayList<IItems>();
		Hat hat = new Hat("Cotton", "Cap", 100, 20);
		IItems buiscuit = new Buiscuit();
		IItems hatAdapter = new HatAdapter(hat);
		cartItems.add(buiscuit);
	    cartItems.add(hatAdapter);
	    
	    
	    double sum =0;
	    for(IItems items:cartItems) {
	    	System.out.println(items);
	    	sum = sum+items.getPice();
	    	
	    	
	    }
	    
	    
	    System.out.println("Total Price: "+sum);
	   
	    
	   
	
	}	
	

}
