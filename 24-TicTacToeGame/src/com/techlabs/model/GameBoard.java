package com.techlabs.model;

import java.util.Arrays;

public class GameBoard implements IGameBoard {

	private char[][] board = new char[3][3];

	@Override
	public void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}

	}

	@Override
	public void placeMark(int x, int y, char mark) {
		board[x][y] = mark;

	}

	@Override
	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	@Override
	public boolean isCellEmpty(int x, int y) {
		// TODO Auto-generated method stub
		return board[x][y] == '-';
	}

	@Override
	public char[][] getBoard() {
		// TODO Auto-generated method stub
		return board;
	}

}
