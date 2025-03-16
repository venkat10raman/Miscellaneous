package com.miscellaneous.dsp.decorator.cased;

public interface Notifier {

	public void send(String message);
	
	public String getUsername();
	
	public static Notifier withWhatsApp(Notifier notifier) {
		return new Notifier() {
			
			@Override
			public void send(String message) {
				notifier.send(message);
				System.out.println("Sending " + message + " by WhatsApp to ::: " + getUsername());
			}
			
			@Override
			public String getUsername() {
				return notifier.getUsername();
			}
		};
	}
	
	public static Notifier withFacebook(Notifier notifier) {
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
