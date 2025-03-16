package com.miscellaneous.dsp.decorator.casec;

public class DecoratorDemoC {

	public static void main(String[] args) {
		Notifier notifier = new FacebookNotifier(new WhatsAppNotifier(new BasicNotifier("Venkat")));
		
		notifier.send("Hi There");
	}

}
