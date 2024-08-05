package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.CricketPlayer;

public class CricketPlayerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CricketPlayer players[] = new CricketPlayer[2];
		
		for(int i=0;i<players.length;i++) {
			System.out.println("Enter information of player "+(i+1));
			System.out.println("Enter Player Id:");
			int playerId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Player name:");
			String name = sc.nextLine();
			System.out.println("Enter Number of Matches:");
			int numberOfMatches = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter runs:");
			int runs = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter wickets:");
			int wickets = sc.nextInt();
			sc.nextLine();
			
			players[i]= new CricketPlayer(playerId,name,numberOfMatches,runs,wickets);
			
		}
		
		
		
	}
}
