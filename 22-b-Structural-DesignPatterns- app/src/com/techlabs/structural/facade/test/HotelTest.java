package com.techlabs.structural.facade.test;

import java.util.Scanner;

import com.techlabs.structural.facade.model.HotelReception;

public class HotelTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HotelReception reception = new HotelReception();
		System.out.println("Select Menu");
		System.out.println("1.Indian Menu\n2.Italian Menu");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: reception.getIndianMenu(); break;
		case 2: reception.getItalianMenu();break;
		default: System.exit(0);
		}
	}

}
