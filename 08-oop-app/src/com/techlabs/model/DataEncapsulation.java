package com.techlabs.model;

public class DataEncapsulation {

	private int height;
	private int width;
	private int depth;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidht() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	
	public int calculatearea() {
		return height*width*depth;
		
	}
}
