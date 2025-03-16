package com.miscellaneous.dsp.decorator.cased;

public class FacebookNotifier {
	
	public static Notifier notify(Notifier notifier) {
		return new Notifier() {
			
			@Override
			public void send(String message) {
				notifier.send(message);
				System.out.println("Sending " + message + " by Facebook to ::: " + getUsername());
			}
			
			@Override
			public String getUsername() {
				return notifier.getUsername();
			}
		};
	}

}
