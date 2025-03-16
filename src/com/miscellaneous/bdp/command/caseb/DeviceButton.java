package com.miscellaneous.bdp.command.caseb;

public class DeviceButton {
	
	private Command command;

	public DeviceButton(Command command) {
		this.command = command;
	}
	
	public void press() {
		command.execute();
	}
	
	public void pressUndo() {
		command.undo();
	}

}
