package com.techlabs.model;

public interface IGameBoard {
	
	public void initializeBoard();
	public void placeMark(int x, int y,char mark);
	
	public void printBoard();
	boolean isCellEmpty(int x, int y);
	public char[][] getBoard();
	
	

}
