package com.techlabs.behavioural.observer.model;

public class WhatsappNotifier implements INotifier{

	@Override
	public void notification(String message) {
		System.out.println("WhatsApp notifier: "+ message);
		// TODO Auto-generated method stub
		
	}

}
