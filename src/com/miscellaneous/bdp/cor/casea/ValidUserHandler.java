package com.miscellaneous.bdp.cor.casea;

public class ValidUserHandler extends Handler {
	
	private Database database;
	
	public ValidUserHandler(Database database) {
		this.database = database;
	}

	@Override
	public boolean handle(String username, String password) {
		if(database.isValidUser(username)) {
			System.out.println("This username is Valid.");
			return handleNext(username, password);
		}
		System.out.println("This username is not Registered!!");
		System.out.println("Sign up to our App now!!");
		return database.isValidUser(username);
	}

}
