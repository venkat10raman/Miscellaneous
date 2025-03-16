package com.miscellaneous.bdp.command.caseb;

public class TurnTeleOn implements Command {
	
	private ElectronicDevice electronicDevice;
	
	public TurnTeleOn(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		electronicDevice.on();
	}

	@Override
	public void undo() {
		electronicDevice.off();
	}

}
