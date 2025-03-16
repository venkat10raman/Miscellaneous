package com.miscellaneous.bdp.cor.caseb;

public class Level2SupportHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Level 2 Support handled the request.");
        } else {
        	handleNext(request);
        }
	}

}
