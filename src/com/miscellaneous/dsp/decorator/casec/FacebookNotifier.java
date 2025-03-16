package com.miscellaneous.dsp.decorator.casec;

public class FacebookNotifier extends NotifierDecorator {

	protected FacebookNotifier(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void send(String message) {
		super.send(message);
		System.out.println("Sending " + message + " by Facebook to ::: " + getUsername());
	}

}
