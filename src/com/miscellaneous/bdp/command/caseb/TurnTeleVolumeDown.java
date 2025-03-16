package com.miscellaneous.bdp.command.caseb;

public class TurnTeleVolumeDown implements Command {
	
	private ElectronicDevice electronicDevice;

	public TurnTeleVolumeDown(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		electronicDevice.volumeDown();
	}

	@Override
	public void undo() {
		electronicDevice.volumeUp();
	}

}
