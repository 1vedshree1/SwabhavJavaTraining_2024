package com.techlabs.behavioural.state.model;

public class Dispatch implements IPacketState{
	
	@Override
	public void next(Packet packet) {
		packet.setState(new Delievered());
	}

	@Override
	public void previous(Packet packet) {
		packet.setState(new Ordered());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is in Dispatch State");
		// TODO Auto-generated method stub
		
	}
	


}
