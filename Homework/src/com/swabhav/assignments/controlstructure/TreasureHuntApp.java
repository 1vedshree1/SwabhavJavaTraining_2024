package com.swabhav.assignments.controlstructure;

import java.util.Scanner;

public class TreasureHuntApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("***Welcome to Treasure Island***");
		System.out.println("Your mission is to find the treasure.");

		System.out.println("Choose Direction (Left or Right): ");
		String direction = sc.nextLine();
		direction = direction.toLowerCase();

		if (direction.equals("left")) {
			System.out.println("Choose Activity (Swim or wait): ");
			String activity = sc.nextLine();
			activity = activity.toLowerCase();
			if (activity.equals("wait")) {
				System.out.println("Choose Colors (Red,Blue,Yellow): ");
				String color = sc.nextLine();
				color = color.toLowerCase();
				switch (color) {
				case "red":
					System.out.println("Burned by fire. !!Game Over!!");
					break;
				case "blue":
					System.out.println("Eaten by beasts. !!Game Over!!");
					break;
				case "yellow":
					System.out.println("!!You Win!!");
					break;
				default:
					System.out.println("Game Over");
				}
			} else {
				System.out.println("Attacked by trout. !!Game Over!!");
			}
		} else {
			System.out.println("Fall into a hole. !!Game Over!!");
		}
	}

}
