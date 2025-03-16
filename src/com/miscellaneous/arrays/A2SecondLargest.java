package com.miscellaneous.arrays;

import java.util.Random;

import com.miscellaneous.util.CommonUtil;

public class A2SecondLargest {

	public static void main(String[] args) {
		int[] array = new int[10];

		Random random = new Random();
		for(int i=0; i < 10; i++) {
			array[i] = random.nextInt(-20, 20);
		}
		CommonUtil.printIntArray(array);
		secondLargest(array);
		secondSmallest(array);
	}

	private static void secondSmallest(int[] array) {
		int firstSmallest, secondSmallest;
		firstSmallest = Math.min(array[0], array[1]);
		secondSmallest = Math.max(array[0], array[1]);
		int temp = 0;
		for(int i=2; i<array.length;i++) {
			temp = array[i];
			if(temp < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = temp;
			} else if(temp > firstSmallest && temp < secondSmallest) {
				secondSmallest = temp;
			}
		}
		
		System.out.println("First Smallest ::: " + firstSmallest);
		System.out.println("Second Smallest ::: " + secondSmallest);
	}

	private static void secondLargest(int[] array) {
		int firstLargest, secondLargest;
		firstLargest = Math.max(array[0], array[1]);
		secondLargest = Math.min(array[0], array[1]);
		
		int temp = 0;
		for(int i=2; i<array.length;i++) {
			temp = array[i];
			if(temp > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = temp;
			} else if(temp < firstLargest && temp > secondLargest) {
				secondLargest = temp;
			}
		}
		System.out.println("First Largest ::: " + firstLargest);
		System.out.println("Second Largest ::: " + secondLargest);
	}

}
