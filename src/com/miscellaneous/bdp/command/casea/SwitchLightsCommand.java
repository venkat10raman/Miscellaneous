package com.miscellaneous.bdp.command.casea;

public class SwitchLightsCommand implements Command {
	
	private Light light;
	
	public SwitchLightsCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchLights();
	}

}
