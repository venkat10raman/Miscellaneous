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
	
	public static void printIntArray(int[] arr, int lastIndex) {
		if(lastIndex <= 0) {
			System.out.println("Last Index is zero");
			return;
		}
		String sep = "";
		int i = 0;
		while(i < lastIndex) {
			System.out.print(sep + arr[i++]);
			sep = ", ";
		}
		System.out.println();
	}

}
