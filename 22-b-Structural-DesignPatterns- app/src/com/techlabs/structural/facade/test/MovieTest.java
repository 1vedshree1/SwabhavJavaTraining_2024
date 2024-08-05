package com.techlabs.structural.facade.test;

import java.util.Scanner;

import com.techlabs.structural.facade.model.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Movie movie = new Movie();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select");
		System.out.println("1.Start Movie\n2.Stop Movie");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:movie.startMovie();  break;
		case 2:movie.stopMovie(); break;
		default: System.exit(0);
		}
		
	}

}
