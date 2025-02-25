package com.techlabs.structural.proxy.model;

public class ProxyImage implements IImage {
    private RealImage realimage;
    private String filename;
    
    
    
    
	public ProxyImage(String filename) {
		super();
		this.filename = filename;
	}




	@Override
	public void display() {
		if (realimage==null) { 
			System.out.println("Image is not loaded.");
			realimage = new RealImage(filename);
		}
		System.out.println("loaded");
		realimage.display();
		
	}

}
