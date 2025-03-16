package com.miscellaneous.bdp.cor.casea;

public class RoleCheckHandler extends Handler {

	@Override
	public boolean handle(String username, String password) {
		if("admin".equalsIgnoreCase(username)) {
			System.out.println("Loading Admin Page...");
			return true;
		}
		System.out.println("Loading default Page...");
		return handleNext(username, password);
	}

}
