package com.miscellaneous.bdp.command.casea;

public class Room {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand() {
		this.command.execute();
	}
}
