package com.miscellaneous.geeks.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A4RemoveDuplicates {

	public static void main(String[] args) {
		int[] array = {9,9,2,2,2,7,7,3,6,4,4};
		removeDuplicates(array);
	}
	
	private static void removeDuplicates(int[] array) {
		System.out.println(Arrays.toString(array));
		Set<Integer> set = new HashSet<>();
		int left=0, index=0, right = array.length;
		while(left < right) {
			if(set.add(array[left])) {
				array[index] = array[left];
				index++;
			}
			left++;
		}
		System.out.println(Arrays.toString(array));
	}

}
