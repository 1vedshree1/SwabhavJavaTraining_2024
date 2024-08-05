package com.techlabs.behavioural.state.model;

public class Delievered implements IPacketState{
	@Override
	public void next(Packet packet) {
		System.out.println("Packet is already delievered");
	}

	@Override
	public void previous(Packet packet) {
		packet.setState(new Dispatch());
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is in Delievered State");
		// TODO Auto-generated method stub
		
	}
	

}
