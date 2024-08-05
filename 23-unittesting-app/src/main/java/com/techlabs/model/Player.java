package com.techlabs.model;

public class Player implements IPlayer{

	private String name;
	private char mark;
	
	
	public Player(String name, char mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub

		return name;
	}

	

	@Override
	public char getMark() {
		// TODO Auto-generated method stub
		return mark;
	}
	
	
	
}
