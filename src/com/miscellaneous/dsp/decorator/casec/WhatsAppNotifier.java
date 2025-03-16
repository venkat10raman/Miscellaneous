package com.miscellaneous.dsp.decorator.casec;

public class WhatsAppNotifier extends NotifierDecorator {

	protected WhatsAppNotifier(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void send(String message) {
		super.send(message);
		System.out.println("Sending " + message + " by WhatsApp to ::: " + getUsername());
	}
	
	

}
