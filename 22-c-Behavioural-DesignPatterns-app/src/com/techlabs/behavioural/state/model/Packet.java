package com.techlabs.behavioural.state.model;

public class Packet {
	IPacketState state;

	public IPacketState getState() {
		return state;
	}
	public void setState(IPacketState state) {
		this.state = state;
	}
	public Packet(IPacketState state) {
		this.state = state;
	}
	public void nextState() {
		state.next(this);
		setState(state);
	}
	public void previousState() {
		state.previous(this);
		
	}
	public void printstatus() {
		state.current(this);
	}
	

}
