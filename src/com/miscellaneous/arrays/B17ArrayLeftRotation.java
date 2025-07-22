package com.miscellaneous.arrays;

import com.miscellaneous.util.CommonUtil;

public class B17ArrayLeftRotation {

	public static void main(String[] args) {
		leftRotate(new int[] {1,2,3,4,5,6,7}, 2);
	}
	
	private static void leftRotate(int[] array, int rotations) {
		CommonUtil.printIntArray(array);
		
		rotations = rotations % array.length;
		if(rotations == 0) {
			System.out.println("After rotation");
			CommonUtil.printIntArray(array);
			return;
		} 
		
		int temp;
        for (int i = 0; i < rotations; i++) {
        	temp = array[0];
        	for (int j = 0; j < array.length-1; j++) {
        		array[j] = array[j+1];
        	}
        	array[array.length - 1] = temp;
        }
		
		CommonUtil.printIntArray(array);
	}

}
