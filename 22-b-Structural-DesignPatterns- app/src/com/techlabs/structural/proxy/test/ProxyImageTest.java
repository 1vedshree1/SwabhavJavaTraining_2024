package com.techlabs.structural.proxy.test;
import com.techlabs.structural.proxy.model.*;
public class ProxyImageTest {
	public static void main(String[] args) {
		IImage image = new ProxyImage("flower.jpg");
		image.display();
		
		image.display();
		
	}

}
