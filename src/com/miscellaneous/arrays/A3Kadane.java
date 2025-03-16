package com.miscellaneous.arrays;

import java.util.Random;

import com.miscellaneous.util.CommonUtil;

public class A3Kadane {

	public static void main(String[] args) {
		
		int i = 0;
		while(i < 5) {
			repeat();
			i++;
		}
		
		getSubArrayWithMaxSum(new int[] {2, -3, 7, -4, 2, 5, -8, 8, -1});
	}
	
	private static void repeat() {
		int[] array = new int[10];
		Random random = new Random();
		for(int i=0; i < 10; i++) {
			array[i] = random.nextInt(-20, 20);
		}
		getSubArrayWithMaxSum(array);
	}

	private static void getSubArrayWithMaxSum(int[] array) {
		CommonUtil.printIntArray(array);
		//Initializing bestSum to first element of input array and
		//bestStart and bestEnd to first index i.e 0
		int bestSum = array[0];
		int bestStart = 0;
		int bestEnd = 0;

		//Initializing currentSum and currentStart to 0
		int currentSum = 0;
		int currentStart = 0;

		int arrayLength = array.length;
		for(int i = 0; i < arrayLength ; i++) {
			//If currentSum becomes negative, clearing currentSum and
			//setting currentStart to next element
			currentSum = currentSum + array[i];

			if(currentSum < 0) {
				currentSum =0;
				currentStart = i+1;
			} else if(currentSum > bestSum) {
				// If currentSum exceeds bestSum, assigning currentSum to bestSum and 
				//updating bestStart and bestEnd
				bestSum = currentSum;
				bestStart = currentStart;
				bestEnd = i;
			}
		}

		CommonUtil.printIntArray(array, bestStart, bestEnd);
		System.out.println("Sum : "+bestSum);
		System.out.println("++++++++++++++++++");
	}

}
