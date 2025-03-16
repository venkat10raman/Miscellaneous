package com.miscellaneous.arrays;

import java.util.HashMap;
import java.util.Map;

import com.miscellaneous.util.CommonUtil;

public class A8TwoSum {

	public static void main(String[] args) {
		twoSum(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		  
		twoSum(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
  
		twoSum(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);
  
		twoSum(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
	}
	
	private static void twoSum(int[] array, int sum) {
		CommonUtil.printIntArray(array);
		Map<Integer, Integer> map = new HashMap<>();
		System.out.println("sum ::: " + sum);
		int arrayLength = array.length;
		for(int i=0; i < arrayLength; i++) {
			int complement = sum - array[i];
			if(map.containsKey(complement)) {
				System.out.println(complement +" :: " + array[i]);
				System.out.println( map.get(complement) + " :: " + i);
				System.out.println("--------");
			}
			map.put(array[i], i);
		}
		
		System.out.println("+++++++++++++++++++++++");
	}

}
