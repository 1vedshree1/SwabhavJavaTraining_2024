package com.swabhav.poc;

public class AccessSpecifier {
	
	private int id =1;
	public String name="John";
	protected String address="Nerul";
	int age=20;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
		
		public static void main(String args[]) {
			AccessSpecifier access = new AccessSpecifier();
			System.out.println(access.name);
			System.out.println(access.address);
			System.out.println(access.getId());
			System.out.println(access.age);
			
			
		}
	}
	


