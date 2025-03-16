package com.miscellaneous.dp.builder;

public class DemoBuilder {
	
	public static void main(String[] args) {
		PhoneBuilder builder = PhoneBuilder.create("linux", "intel");
		builder.setRam(16).setBattery(50000).setScreenSize(14);
		System.out.println(builder.build());
//		Phone phone = new Phone();
	}

}
