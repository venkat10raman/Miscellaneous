package com.miscellaneous.geeks.arrays;

import com.miscellaneous.util.CommonUtil;

public class B1LeadersOfArray {

	public static void main(String[] args) {
		leadersOfTheArray(new int[] {12, 9, 7, 14, 8, 6, 3});
		  
		leadersOfTheArray(new int[] {8, 23, 19, 21, 15, 6, 11});
  
		leadersOfTheArray(new int[] {55, 67, 71, 57, 51, 63, 38});
  
		leadersOfTheArray(new int[] {21, 58, 44, 14, 51, 36, 23});
	}

	private static void leadersOfTheArray(int[] array) {
		CommonUtil.printIntArray(array);

		//Getting the length of input array
		int arrayLength = array.length;

		//Assuming the last element as max
		int max = array[arrayLength-1];

		System.out.println("The leaders in the array are : ");

		//Traversing the remaining elements from right to left
		for (int i = array.length-2; i >= 0; i--) {
			if(array[i] > max) {
				System.out.print(max + " -> ");
                max = array[i];
			}
		}
		System.out.println(max);
		System.out.println("--------------");
	}

}
