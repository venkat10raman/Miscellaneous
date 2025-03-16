package com.miscellaneous.bdp.cor.casea;

import java.util.HashMap;
import java.util.Map;

public class Database {
	
	private final Map<String, String> users;
	
	public Database() {
		users = new HashMap<>();
		users.put("user", "password");
		users.put("admin", "password");
	}
	
	public boolean isValidUser(String username) {
		return users.containsKey(username);
	}
	
	public boolean isValidPassword(String password) {
		return users.containsValue(password);
	}

}
