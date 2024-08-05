package com.techlabs.model;

import java.util.regex.Pattern;
import com.techlabs.exception.EmailNotValidException;
import com.techlabs.exception.PasswordNotValidException;

public class User {
	private String email;
	private String password;

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String validatePassword(String password) {
		if (!isValidPassword(password)) {
			throw new PasswordNotValidException(password);
		}
		return "Password: " + password;
	}

	public String validateEmail(String email) {
		if (!isValidEmail(email)) {
			throw new EmailNotValidException(email);
		}
		return "Email: " + email;
	}

	private boolean isValidEmail(String email) {

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		return pattern.matcher(email).matches();
	}

	private boolean isValidPassword(String password) {

		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
		Pattern pattern = Pattern.compile(passwordRegex);
		return pattern.matcher(password).matches();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
