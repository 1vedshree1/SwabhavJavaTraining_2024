package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exception.EmailNotValidException;
import com.techlabs.exception.PasswordNotValidException;
import com.techlabs.model.User;

public class UserTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		

		System.out.println("Enter Email");
		String email = scanner.next();

		System.out.println("Enter Password");
		String password = scanner.next();
		User user = new User(email,password);

		try {

			System.out.println(user.validateEmail(email));

		}

		catch (EmailNotValidException exception) {
			System.out.println(exception.getMessage());
		}
		try {
			System.out.println(user.validatePassword(password));

		} catch (PasswordNotValidException exception) {
			System.out.println(exception.getMessage());
		}
		
	        
	 
		
		
		
	
	
		
		
		
	}
}

