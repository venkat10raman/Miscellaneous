package com.miscellaneous.dsp.decorator.casec;

public abstract class NotifierDecorator implements Notifier {
	
	private final Notifier notifier;
	
	protected NotifierDecorator(Notifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public void send(String message) {
		notifier.send(message);
	}

	@Override
	public String getUsername() {
		return notifier.getUsername();
	}

}
