package com.miscellaneous.arrays;

import java.util.Random;

import com.miscellaneous.util.CommonUtil;

public class C24WaterContainer {

	public static void main(String[] args) {
		int[] array = new int[8];

		Random random = new Random();
		for(int i=0; i < 8; i++) {
			array[i] = random.nextInt(1, 20);
		}
		mostWaterContainer(array);
	}
	
	private static void mostWaterContainer(int[] array) {
		CommonUtil.printIntArray(array);
		int left=0, right = array.length-1, max=0, currentMax=0;
		
		while(left < right) {
			currentMax = Math.min(array[left], array[right]) * (right - left );
			max = Math.max(max, currentMax);
			if(array[left] < array[right]) left++;
			else right--;
		}
		
		System.out.println(max);
	}
	
	

}
