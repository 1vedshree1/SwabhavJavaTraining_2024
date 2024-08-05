package com.techlabs.behavioural.observer.model;

public class EmailNotifier implements INotifier{

	@Override
	public void notification(String message) {
		
		System.out.println("Email Notifier: "+message);
	}

}
