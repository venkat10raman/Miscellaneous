package com.miscellaneous.arrays;

import com.miscellaneous.util.CommonUtil;

public class B18ArrayRightRotation {

	public static void main(String[] args) {
		rightRotation(new int[] {1,2,3,4,5,6,7}, 2);
	}

	private static void rightRotation(int[] array, int rotations) {
		CommonUtil.printIntArray(array);

		rotations = Math.abs(rotations);
		while(rotations >= array.length-1) {
			rotations = rotations-array.length;
		}

		if(rotations == 0) {
			System.out.println("After rotation");
			CommonUtil.printIntArray(array);
			return;
		} 
		
		int temp = 0;
		for (int i = 0; i < rotations; i++) {
			temp = array[array.length-1];
			for(int j=array.length-1; j>0; j--) {
				array[j]=array[j-1];
			}
			array[0] = temp;
		}
		
		
		CommonUtil.printIntArray(array);
	}
}
