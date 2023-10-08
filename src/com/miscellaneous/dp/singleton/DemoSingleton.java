package com.miscellaneous.dp.singleton;

public class DemoSingleton {

	public static void main(String[] args) {
		System.out.println(SingletonBillPugh.getInstance());
		System.out.println(SingletonEnum.instance);
		System.out.println(SingletonDoubleCheck.getInstance());
	}

}
