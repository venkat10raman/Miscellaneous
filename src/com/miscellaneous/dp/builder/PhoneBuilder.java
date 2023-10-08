package com.miscellaneous.dp.builder;

public class PhoneBuilder {
	
	//required
	private String os;
	private String processor;
	
	//optional
	private int ram;
	private int battery;
	private double screenSize;
	
	private PhoneBuilder() {}
	
	public static PhoneBuilder create(String os, String processor) {
		PhoneBuilder pb = new PhoneBuilder();
		return pb.setOs(os).setProcessor(processor);
	}

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public Phone build() {
		return new Phone(this);
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
	
}
