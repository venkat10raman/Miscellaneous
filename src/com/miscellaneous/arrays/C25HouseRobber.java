package com.miscellaneous.arrays;

import com.miscellaneous.util.CommonUtil;

public class C25HouseRobber {

	public static void main(String[] args) {
		int[] houses = {2, 7, 9, 3, 1};
		maxRob(houses);
		maxRob(new int[] {1,6,8,3,5,9});
		maxRob(new int[] {1,6,2,3,5,4});
	}
	
	private static void maxRob(int[] array) {
		if (array.length == 0) return;
        if (array.length == 1) {
        	System.out.println("Max amount is ::: " + array[0]);
        }
        
        int last=0, secondLast=0;
        int result = 0;
        
        for(int num : array) {
        	result = Math.max(last, secondLast+num);
        	secondLast = last;
        	last = result;
        }
        
        int secondPrev=array[0], prev = Math.max(array[0], array[1]);
        int maxRob = 0;
        for(int i = 2 ; i < array.length-1; i++) {
        	maxRob = Math.max(secondPrev + array[i], prev);
        	secondPrev = prev;
        	prev = maxRob;
        }
        CommonUtil.printIntArray(array);
        System.out.println("Maximum amount that can be robbed: " + last);
        System.out.println("------------");
	}

}
