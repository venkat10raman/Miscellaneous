package com.miscellaneous.bdp.cor.casea;

public class CORDemoA {

	public static void main(String[] args) {
		Database database = new Database();
		Handler handler = new ValidUserHandler(database);
		handler.setNextHandler(new ValidPasswordHandler(database))
				.setNextHandler(new RoleCheckHandler());
		
		AuthService authService = new AuthService(handler);
		authService.login("user", "password");
		authService.login("admin", "password");
		authService.login("user", "pasword");
	}

}
