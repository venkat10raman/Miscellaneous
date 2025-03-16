package com.miscellaneous.bdp.command.caseb;

public class CommandDemoB {

	public static void main(String[] args) {
		ElectronicDevice television = TeleRemote.getDevice();
		
		Command onCommand = new TurnTeleOn(television);
		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press(); 
		
		onCommand = new TurnTeleVolumeUp(television);
		onPressed = new DeviceButton(onCommand);
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		
		onCommand = new TurnTeleVolumeDown(television);
		onPressed = new DeviceButton(onCommand);
		onPressed.press();
		onPressed.press();
		
		
		onCommand = new TurnTeleOff(television);
		onPressed = new DeviceButton(onCommand);
		onPressed.press();
		
		
	}

}
