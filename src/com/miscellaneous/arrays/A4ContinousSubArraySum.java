package com.miscellaneous.arrays;

import java.util.Random;

import com.miscellaneous.util.CommonUtil;

public class A4ContinousSubArraySum {

	public static void main(String[] args) {
		int[] array = new int[10];

		Random random = new Random();
		for(int i=0; i < 10; i++) {
			array[i] = random.nextInt(-20, 20);
		}
		subArray(array, 5);
		
		subArray(new int[] {2, -3, 7, -4, 2, 5, -8, 6, -1}, 10);
		
		subArray(new int[] {2, 4, 2, 8, 3, 3, 2, -4, 12}, 8);
        
        subArray(new int[] {5, -9, 4, -2, 7, 1, -4, -3, -7}, -7);
          
        subArray(new int[] {7, 3, 6, 5, 21, -6, -15, 28, 8}, 21);
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

			if(currentSum < 0) {
				currentSum = 0;
				currentStart = i+1;
			}
			while(currentSum > sum && currentStart < arraySize && currentStart < i) {
				currentSum = currentSum - array[currentStart];
				currentStart++;
			}
			if(currentSum == sum) {
				bestStart = currentStart;
				bestEnd = i;
				CommonUtil.printIntArray(array, bestStart, bestEnd);
			}
		}
		
		System.out.println("=====================================");
	}

}
