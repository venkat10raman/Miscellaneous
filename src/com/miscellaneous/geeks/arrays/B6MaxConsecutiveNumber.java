package com.miscellaneous.geeks.arrays;

public class B6MaxConsecutiveNumber {

	public static void main(String[] args) {
		int[] array = {1,0,0,0,1,1,1,0,0,0,0,0};
		maxConsecutiveOccurance(array);
	}
	
	private static void maxConsecutiveOccurance(int[] array) {
		int result = 0, size = array.length, count=0;
		for(int i=0; i<size; i++) {
			if(array[i] == 0) {
				count = 0;
			} else {
				count++;
				result = Math.max(count, result);
			}
		}
		System.out.println("Max consecutive 1 are :: " + result);
	}

}
