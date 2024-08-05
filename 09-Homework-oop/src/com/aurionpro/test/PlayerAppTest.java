package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.PlayerApp;


public class PlayerAppTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Player: ");
		int numberOfPlayers = sc.nextInt();
		
		PlayerApp players[] = new PlayerApp[numberOfPlayers];
		
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
			
			players[i]= new PlayerApp(playerId,name,numberOfMatches,runs,wickets);
			
		}
		
		for(int i=0;i<players.length;i++) {
			
			System.out.println("Player Id:"+players[i].getPlayerId());
			System.out.println("player Name:"+players[i].getName());
			System.out.println("Number Of Matches:"+players[i].getNumberOfMatches());
			System.out.println("Runs:"+players[i].getRuns());
			System.out.println("Wickets: "+players[i].getWickets());
			
			
			players[i].average(players[i].getRuns(),players[i].getWickets());
			System.out.println("Average: "+players[i].average);
		}
		
		
		double max=0;
		
		for(int i=0; i< players.length;i++) {
			if(players[i].average>max) {
				max=players[i].average;	
			}
		
		}
		for(int i=0;i<players.length;i++) {
			if(players[i].average == max) {
				System.out.println(players[i].getName()+ " has maximum average. average:"+players[i].average);
			}
		}
		
		for(int i=0;i<players.length;i++) {
			
			for(int j=i+1;j<players.length;j++) {
				
				if(players[j].average<players[i].average) {
					
					PlayerApp temp = players[i];
					players[i]= players[j];
					players[j] = temp;
					
					
				}
				
				
			}
			
		}
		
		for(int i =0;i<players.length;i++) {
			System.out.println();
			System.out.println("List Of Players");
			System.out.println("Player Id:"+players[i].getPlayerId());
			System.out.println("player Name:"+players[i].getName());
			System.out.println("Number Of Matches:"+players[i].getNumberOfMatches());
			System.out.println("Runs:"+players[i].getRuns());
			System.out.println("Wickets: "+players[i].getWickets());
			
			
			players[i].average(players[i].getRuns(),players[i].getWickets());
			System.out.println("Average: "+players[i].average);
			
		}

		
		
		
		
	}

	
	

	

}
