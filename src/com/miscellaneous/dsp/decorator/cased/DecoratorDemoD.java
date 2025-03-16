package com.miscellaneous.dsp.decorator.cased;

public class DecoratorDemoD {

	public static void main(String[] args) {
		NotifierDecorator.sendNotification(new BasicNotifier("Venkat"), "Hi There ..." ,Notifier::withWhatsApp, Notifier::withFacebook);
		
		NotifierDecorator.sendNotification(new BasicNotifier("Raman"), "How are ya ...", WhatsAppNotifier::notify, FacebookNotifier::notify);
	}

}
