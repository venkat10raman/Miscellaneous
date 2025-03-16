package com.miscellaneous.arrays;

import java.util.Arrays;

import com.miscellaneous.util.CommonUtil;

public class B19MinAbsDifference {

	public static void main(String[] args) {
		minimumAbsoluteDifference(new int[] {5, 8, 4, 2, 9, 0});
        minimumAbsoluteDifference(new int[] {45, -89, 12, -62, 31, -57});
        minimumAbsoluteDifference(new int[] {5, -3, 7, -2});
	}
	
	private static void minimumAbsoluteDifference(int[] array) {
		CommonUtil.printIntArray(array);
		Arrays.sort(array);
		System.out.print("Array After Sort ::: ");
		CommonUtil.printIntArray(array);
		
		int minimum = Math.abs(array[1] - array[0]);
        int firstElement = array[0];
        int secondElement = array[1];
        
        for (int i = 2; i < array.length; i++) {
        	if(Math.abs(array[i] - array[i-1]) > minimum) {
        		minimum = Math.abs(array[i] - array[i-1]);
        		firstElement = array[i-1];
        		secondElement = array[i];
        	}
        }
        System.out.println("Minimum Absolute Difference : "+minimum);
        System.out.println("Pair Of Elements : ("+firstElement+", "+secondElement+")");
        System.out.println("==========================");
	}

}
