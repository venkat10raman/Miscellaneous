package com.miscellaneous.arrays;

import java.util.Random;

import com.miscellaneous.util.CommonUtil;

public class A6ZeroOneSort {

	public static void main(String[] args) {
		int i =0;
		while(i < 5) {
			repeat();
			i++;
		}

		sortBinaryArray(new int[] {1, 0, 1, 1, 0, 1, 0, 1});
		sortBinaryArray(new int[] {1, 1, 1, 1, 0, 0, 0, 0});
		sortBinaryArray(new int[] {1, 1, 0, 0, 1, 1, 0, 0});
	}

	private static void repeat() {
		int[] array = new int[10];

		Random random = new Random();
		for(int i=0; i < 10; i++) {
			array[i] = random.nextInt(0, 2);
		}
		sortBinaryArray(array);
	}


	private static void sortBinaryArray(int[] inputArray) {
		int left = 0;

		int right = inputArray.length-1;

		System.out.println("Input Array Before Sorting : ");
		CommonUtil.printIntArray(inputArray);

		while (left < right) {
			if (inputArray[left] == 1){
				//Swapping

				CommonUtil.swap(inputArray, left, right);

				right--;
			}else{
				left++;
			}
		}
		System.out.println("Input Array After Sorting : ");
		CommonUtil.printIntArray(inputArray);
		System.out.println("============================");

	}
}
