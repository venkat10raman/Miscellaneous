package com.miscellaneous.bdp.command.caseb;

public class TurnTeleOff implements Command {

	private ElectronicDevice electronicDevice;

	public TurnTeleOff(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		electronicDevice.off();
	}

	@Override
	public void undo() {
		electronicDevice.on();
	}

}
