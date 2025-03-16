package com.miscellaneous.bdp.cor.casea;

public class ValidPasswordHandler extends Handler {
	
	private Database database;
	
	public ValidPasswordHandler(Database database) {
		this.database = database;
	}

	@Override
	public boolean handle(String username, String password) {
		if(database.isValidPassword(password)) {
			System.out.println("Entered Password is Valid.");
			return handleNext(username, password);
		}
		System.out.println("Wrong passwrod");
		return false;
	}

}
