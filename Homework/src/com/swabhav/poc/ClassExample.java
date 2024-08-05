package com.swabhav.poc;

public class ClassExample {
	
	public class InnerClass{
		
		private String name;
		public InnerClass() {
			this.setName("This is inner class");
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}
	public static class NestedClass{
		private String name;
		public NestedClass() {
			this.setName("This is nested class");
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}
	
	
	public static void main(String args[]) {
		ClassExample innerclassexample = new ClassExample();
		InnerClass inner = innerclassexample.new InnerClass();
		ClassExample.NestedClass nestedclass = new ClassExample.NestedClass();
		System.out.println(inner.name);
		System.out.println(nestedclass.name);
		
	}
	
	
	

}
