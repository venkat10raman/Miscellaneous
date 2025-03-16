package com.miscellaneous.bdp.cor.caseb;

public class Level1SupportHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 Support handled the request.");
        } else {
            handleNext(request);
        }
	}

}
