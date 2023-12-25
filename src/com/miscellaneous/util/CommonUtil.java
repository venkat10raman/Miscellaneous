package com.miscellaneous.util;

public class CommonUtil {
	
	private CommonUtil() {}
	
	public static void printIntArray(int[] arr) {
		String sep = "";
		for(int a : arr) {
			System.out.print(sep + a);
			sep = ", ";
		}
		System.out.println();
	}

}
