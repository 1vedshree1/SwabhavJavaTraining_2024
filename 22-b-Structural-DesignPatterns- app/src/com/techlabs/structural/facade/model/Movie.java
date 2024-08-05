package com.techlabs.structural.facade.model;

public class Movie {
	DVDPlayer dvd = new DVDPlayer();
	Projector projector = new Projector();
	SoundSystem sound = new SoundSystem();
	
	public void startMovie() {
		dvd.on();
		dvd.start();
		projector.on();
		projector.input();
		sound.start();
		sound.volume();
		
	}
	public void stopMovie() {
		
		dvd.off();
		projector.off();
		sound.stop();
	}

}
