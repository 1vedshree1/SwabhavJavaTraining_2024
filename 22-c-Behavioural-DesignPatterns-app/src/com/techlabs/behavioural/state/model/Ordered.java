package com.techlabs.behavioural.state.model;

public class Ordered implements IPacketState{

	@Override
	public void next(Packet packet) {
		
		packet.setState(new Dispatch());
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("Packet is already in orderd state");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is in Ordered State");
		// TODO Auto-generated method stub
		
	}
	

}
