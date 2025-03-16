package com.miscellaneous.arrays;

import com.miscellaneous.util.CommonUtil;

public class A5ContinousSubArraySum {

	public static void main(String[] args) {
		subArray(new int[] {5, -9, 3, -2, 7, 1, -4, -3, -7}, -7);
	}


	private static void subArray(int[] array, int sum) {

		CommonUtil.printIntArray(array);
		System.out.println("Given sum ::: " + sum);
		//Initializing bestSum to first element of input array and
		//bestStart and bestEnd to first index i.e 0
		int bestStart = 0;
		int bestEnd = 0;

		//Initializing currentSum and currentStart to 0
		int currentSum = 0;
		int currentStart = 0;

		int arraySize = array.length ;

		for (int i = 0; i < arraySize; i++) {
			//Adding current element to currentSum
			currentSum = currentSum + array[i];

			int tempStart = currentStart;
			int tempSum = currentSum - array[i];
			while(tempSum > sum && tempStart < arraySize ) {
				tempSum = tempSum + array[tempStart];
				tempStart++;
			}
			if(currentSum == sum) {
				bestStart = currentStart;
				bestEnd = tempStart;
				CommonUtil.printIntArray(array, bestStart, bestEnd);
			}
			while(currentSum > sum && currentStart < arraySize && currentStart < i ) {
				currentSum = currentSum - array[currentStart];
				currentStart++;
			}
			if(currentSum == sum) {
				bestStart = currentStart;
				bestEnd = i;
				CommonUtil.printIntArray(array, bestStart, bestEnd);
				currentSum = array[i];
			}
		}

		if(currentSum == sum) {
			CommonUtil.printIntArray(array, bestStart, bestEnd);
		} else {
			System.out.println("Not Present");
		}

		System.out.println("=====================================");
	}
}
