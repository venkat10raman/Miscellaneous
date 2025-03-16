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
	
	public static void printIntArray(int[] arr,int startIndex, int lastIndex) {
		if(lastIndex < 0) {
			System.out.println("Last Index is zero");
			return;
		} else if(startIndex < 0) {
			System.out.println("Last Index is -ve");
			return;
		} else if(startIndex >= arr.length) {
			System.out.println("startIndex is greater than array size");
			return;
		} else if(startIndex > lastIndex) {
			System.out.println("start index is greater than last index");
			return;
		}
		String sep = "";
		while(startIndex <= lastIndex) {
			System.out.print(sep + arr[startIndex++]);
			sep = ", ";
		}
		System.out.println();
	}
	
	public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
