package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exception.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter vote Id:");
		int voterId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter first name:");
		String firstname = scanner.nextLine();
		System.out.println("Enter last name:");
		String lastname = scanner.nextLine();
		System.out.println("Enter age:");
		int age = scanner.nextInt();
		try {
		Voter voter = new Voter(voterId, firstname, lastname, age);
		System.out.println(voter);
		}
		catch(AgeNotValidException exception) {
			System.out.println(exception.getMessage());
		}
	}

}
