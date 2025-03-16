package com.miscellaneous.dsp.decorator.cased;

public class BasicNotifier implements Notifier {
	
	private final String username;
	
	public BasicNotifier(String username) {
		this.username = username;
	}

	@Override
	public void send(String message) {
		System.out.println("Sending " + message + " to the user ::: " + username);
	}

	@Override
	public String getUsername() {
		return username;
	}

}
