package com.miscellaneous.bdp.command.casea;

public class CommandDemoA {

	public static void main(String[] args) {
		Room room = new LivingRoom();
		room.setCommand(new SwitchLightsCommand(new Light()));
		room.executeCommand();
		
		room = new BedRoom();
		room.setCommand(new SwitchLightsCommand(new Light()));
		room.executeCommand();
	}

}
