package com.miscellaneous.dp.builder;

//no setters
//private default constructor 
public class Phone {
	
	//required
	private String os;
	private String processor;
	
	//optional
	private int ram;
	private int battery;
	private double screenSize;
	
	private Phone() {}
	
	public Phone(PhoneBuilder builder) {
		this.os = builder.getOs();
		this.processor = builder.getProcessor();
		
		this.ram = builder.getRam();
		this.battery = builder.getBattery();
		this.screenSize = builder.getScreenSize();
	}
	
	public String getOs() {
		return os;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public int getRam() {
		return ram;
	}
	
	public int getBattery() {
		return battery;
	}
	
	public double getScreenSize() {
		return screenSize;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", ram=" + ram + ", battery=" + battery
				+ ", screenSize=" + screenSize + "]";
	}
	
}
