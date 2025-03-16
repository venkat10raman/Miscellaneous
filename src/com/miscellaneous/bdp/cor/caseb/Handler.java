package com.miscellaneous.bdp.cor.caseb;

public abstract class Handler {

	private Handler next;
	
	public Handler setNextHandler(Handler next) {
		this.next= next;
		return next;
	}
	
	public abstract void handleRequest(Request request);
	
	protected void handleNext(Request request) {
		if(next != null) {
			next.handleRequest(request);
		}
	}
}
