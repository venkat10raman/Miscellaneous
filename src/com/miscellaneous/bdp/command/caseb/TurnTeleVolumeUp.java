package com.miscellaneous.bdp.command.caseb;

public class TurnTeleVolumeUp implements Command {

	private ElectronicDevice electronicDevice;
	
	public TurnTeleVolumeUp(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}
	
	@Override
	public void execute() {
		electronicDevice.volumeUp();
	}

	@Override
	public void undo() {
		electronicDevice.volumeDown();
	}
	
}
