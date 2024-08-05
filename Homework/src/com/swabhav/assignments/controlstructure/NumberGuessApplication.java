package com.swabhav.assignments.controlstructure;

import java.util.Scanner;

public class NumberGuessApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean play = true;

		while (play) {
			java.util.Random random = new java.util.Random();
			int number = random.nextInt(100)+1;

			System.out.println(number);
			int i = 1;
			while (i <= 10) {
				System.out.println("Guess Number :");
				int guessNumber = sc.nextInt();
				sc.nextLine();

				if (guessNumber != number) {

					if (guessNumber > number) {
						System.out.println("Sorry,Too high");

					} else if (guessNumber < number) {
						System.out.println("Sorry,Too low");

					}
				} else if (guessNumber == number) {
					System.out.println("You win");
					System.out.println("No of attempts required: " + i);
					break;
					}
				i++;
				}

			System.out.println("Do you want to play again?");
			String playagain = sc.nextLine();
			if (playagain.equalsIgnoreCase("no")) {
				play = false;
			}

		}

	}
}