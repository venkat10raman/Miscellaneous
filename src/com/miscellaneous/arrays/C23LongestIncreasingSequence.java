package com.miscellaneous.arrays;

import com.miscellaneous.util.CommonUtil;

public class C23LongestIncreasingSequence {

	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 21, 50, 41,42, 60 };
		longestIncreasingSequence(arr);
		
		arr = new int[]{ 40, 22, 9, 33, 21, 50, 41,42, 60 };
		longestIncreasingSequence(arr);
		simpleWay(arr);
	}
	
	private static void simpleWay(int[] array) {
		int n = array.length;

		int[] seqList = new int[n];
		// Initialize LIS values for all indexes
		for (int i = 0; i < n; i++)
			seqList[i] = 0;
		
		// Compute optimized LIS values in
        // bottom up manner
		int currentMax = array[0];
        for (int i = 1; i < n; i++) {
        	currentMax = Math.max(array[i], currentMax);
        	for(int prev=0; prev < i; prev++) {
        		if(array[i] >= currentMax && seqList[i] < seqList[prev]+1) {
        			seqList[prev] = seqList[prev] == 0 ? 1 :seqList[prev];
        			seqList[i] = seqList[prev]+1;
        		}
        	}
        }
        CommonUtil.printIntArray(array);
        CommonUtil.printIntArray(seqList);
        int seq = 0, prev=0;
        for (int i = 0; i < n; i++) {
        	if(seqList[i] == seq+1 && array[i]>= array[prev]) {
        		prev = i;
        		seq++;
        		System.out.print(array[i]+" ");
        	}
        }
        System.out.println();
        System.out.println("--------------------");
	}

	private static void longestIncreasingSequence(int[] array) {
		int n = array.length;

		int[] seqList = new int[n];
		// Initialize LIS values for all indexes
		for (int i = 0; i < n; i++)
			seqList[i] = 0;
		
		// Compute optimized LIS values in
        // bottom up manner
		int currentMax = array[0], prevMaxIndex =0;
        for (int i = 1; i < n; i++) {
        	currentMax = Math.max(array[i], currentMax);
        	if(array[i] >= currentMax && seqList[i] < seqList[prevMaxIndex]+1) {
        		seqList[prevMaxIndex] = seqList[prevMaxIndex] == 0 ? 1 :seqList[prevMaxIndex];
    			seqList[i] = seqList[prevMaxIndex]+1;
    			prevMaxIndex = i;
        	}
        }
        CommonUtil.printIntArray(array);
        CommonUtil.printIntArray(seqList);
        int seq = 0, prev=0;
        for (int i = 0; i < n; i++) {
        	if(seqList[i] == seq+1 && array[i]>= array[prev]) {
        		prev = i;
        		seq++;
        		System.out.print(array[i]+" ");
        	}
        }
        System.out.println();
        System.out.println("--------------------");
	}

}
