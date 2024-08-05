package com.techlabs.model;

public class Box {
	public int height;
	public int width;
	public int depth;
	
	
	public Box() {
		this.height=10;
		this.width=10;
		this.depth=10;
		
	}
	public Box(int height, int width) {
		this();
		this.height=height;
		this.width=width;
		
		
	}
	
	public void display() {
		System.out.println(width);
		System.out.println(height);
		System.out.println(depth);
	}
	
//	public void initialize(int h, int w, int d) {
//		height=h;
//		width=w;
//		depth=d;
//		
//	}
	public int calculatearea() {
		return height*width*depth;
		
	}

}
