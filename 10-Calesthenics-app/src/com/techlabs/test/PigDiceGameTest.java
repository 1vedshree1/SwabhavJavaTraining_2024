package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.PigDiceGame;

public class PigDiceGameTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        PigDiceGame pigdicegame = new PigDiceGame();
        
        PigDiceGame.displayInstructions();
        pigdicegame.start(scanner);
        
   	
	}
	
		
	}
	
	
	
	



