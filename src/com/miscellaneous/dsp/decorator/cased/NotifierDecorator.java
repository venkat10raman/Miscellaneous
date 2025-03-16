package com.miscellaneous.dsp.decorator.cased;

import java.util.function.Function;
import java.util.stream.Stream;

public class NotifierDecorator {
	
	private final Function<Notifier, Notifier> notifierFunction;
	
	private NotifierDecorator(Function<Notifier, Notifier> ...notifiers) {
		this.notifierFunction = Stream.of(notifiers)
				.reduce(Function.identity(), Function::andThen);
	}
	
	public static void sendNotification(Notifier notifier, String message , Function<Notifier, Notifier> ...notifiers) {
		new NotifierDecorator(notifiers).send(notifier, message);
	}

	private void send(Notifier notifier, String message) {
		this.notifierFunction.apply(notifier).send(message);
	}
	
	
}
