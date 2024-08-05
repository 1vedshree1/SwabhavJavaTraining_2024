package com.swabhav.assignments.controlstructure;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int turnCount = 0;
        
        System.out.println("Let's Play PIG!\n");
        System.out.println("* See how many turns it takes you to get to 20.");
        System.out.println("* Turn ends when you hold or roll a 1.");
        System.out.println("* If you roll a 1, you lose all points for the turn.");
        System.out.println("* If you hold, you save all points for the turn.\n");

        while (totalScore < 20) {
            turnCount++;
            System.out.println("TURN " + turnCount + ":\n");
            int turnScore = 0;
            boolean turnOver = false;

            while (!turnOver) {
                System.out.println("Enter 'r' to roll again, 'h' to hold.");
                String input = scanner.nextLine();

                if (input.equals("r")) {
                    int roll = random.nextInt(6) + 1;
                    System.out.println("You rolled: " + roll);
                    if (roll == 1) {
                        System.out.println("Turn over. No Score\n");
                        turnOver = true;
                    } else {
                        turnScore += roll;
                        System.out.println("Your turn score is " + turnScore + " and your total score is " + totalScore);
                        System.out.println("If you hold, you will have " + (totalScore + turnScore) + " points.");
                    }
                } else if (input.equals("h")) {
                    totalScore += turnScore;
                    System.out.println("Your turn score is " + turnScore + " and your total score is " + totalScore + "\n");
                    turnOver = true;
                } else {
                    System.out.println("Invalid input. Please enter 'r' to roll again or 'h' to hold.");
                }
            }
        }

        System.out.println("You Win! You finished in " + turnCount + " turns!");
        System.out.println("Game over!");
        

		
	}

}
