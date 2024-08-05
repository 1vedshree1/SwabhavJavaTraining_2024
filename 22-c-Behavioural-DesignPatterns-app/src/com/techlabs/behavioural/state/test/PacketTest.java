package com.techlabs.behavioural.state.test;

import com.techlabs.behavioural.state.model.Ordered;
import com.techlabs.behavioural.state.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		Packet packet = new Packet(new Ordered());
		packet.printstatus();
		packet.nextState();
		packet.printstatus();
		packet.nextState();
		packet.printstatus();
		packet.previousState();
		packet.printstatus();
		
		
	}

}
