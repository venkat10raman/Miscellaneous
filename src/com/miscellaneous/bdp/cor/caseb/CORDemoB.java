package com.miscellaneous.bdp.cor.caseb;

public class CORDemoB {

	public static void main(String[] args) {
		Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);
        
        Handler handler123 = new Level1SupportHandler();
        	handler123.setNextHandler(new Level2SupportHandler())
        	.setNextHandler(new Level3SupportHandler());
        	
    	handler123.handleRequest(request1);
    	handler123.handleRequest(request2);
    	handler123.handleRequest(request3);
    	
    	Handler handler23 = new Level2SupportHandler();
		handler23.setNextHandler(new Level3SupportHandler());
		
		handler23.handleRequest(request1);
		handler23.handleRequest(request2);
		handler23.handleRequest(request3);
		
		Handler handler13 = new Level1SupportHandler();
    	handler13.setNextHandler(new Level3SupportHandler());
    	
    	handler13.handleRequest(request1);
    	handler13.handleRequest(request2);
    	handler13.handleRequest(request3);
        
	}

}
