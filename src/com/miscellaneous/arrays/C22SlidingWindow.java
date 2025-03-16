package com.miscellaneous.arrays;

import java.util.ArrayList;

import com.miscellaneous.util.CommonUtil;

public class C22SlidingWindow {

	/*
	 * Given an array and an integer k, 
	 * find the maximum for each sliding window of size k.
	 */
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        maxOfSubarrays(arr, k);
	}
	
	private static void maxOfSubarrays(int[] array, int k) {
		CommonUtil.printIntArray(array);
		int n = array.length;
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i=0; i<=n-k; i++) {
        	int max = array[i];
        	for(int j=1; j<k; j++) {
        		max = Math.max(array[i+j], max);
        	}
        	res.add(max);
        }
        
        System.out.println(res);
	}

}
