package com.aurionpro.model;

public class PlayerApp {
	
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	public double average;
	
	public PlayerApp() {
		
	}
public PlayerApp(int playerId,String name, int numberOfMatches, int runs, int wickets) {
	
	this.playerId=playerId;
	this.name=name;
	this.numberOfMatches=numberOfMatches;
	this.runs=runs;
	this.wickets=wickets;
		
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public double average(int runs, int wickets) {
		return average = runs/wickets;
		
	}
	
	
	
	
	


}
