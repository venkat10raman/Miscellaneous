package com.miscellaneous.dp.singleton;

//static holder or billpugh singleton pattern
//safe initilalization and lazy loading handled by jvm
//thread-safe
public class SingletonBillPugh {
	
	private static class Holder {
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}
	
	public static SingletonBillPugh getInstance() {
		return Holder.INSTANCE;
	}
	
	private SingletonBillPugh() {}

}
