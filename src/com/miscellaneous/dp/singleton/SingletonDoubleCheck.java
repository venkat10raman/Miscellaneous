package com.miscellaneous.dp.singleton;

public class SingletonDoubleCheck {
	
	private static volatile SingletonDoubleCheck instance = null;
	
	private SingletonDoubleCheck() {}

	public static SingletonDoubleCheck getInstance() {
		if(instance == null) {
			synchronized (SingletonDoubleCheck.class) {
				if(instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}

}
