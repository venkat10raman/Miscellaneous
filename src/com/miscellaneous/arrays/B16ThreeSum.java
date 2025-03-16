package com.miscellaneous.arrays;

import java.util.Arrays;

import com.miscellaneous.util.CommonUtil;

public class B16ThreeSum {

	public static void main(String[] args) {
		threeSum(new int[] {7, 5, 9, 3, 0, 8, 6}, 12);
		threeSum(new int[] {-3, 7, -1, -5, 2, -9, 1}, 0);
        threeSum(new int[] {17, 51, 39, 29, 33, 21, 65}, 89);
	}
	
	private static void threeSum(int[] array, int target) {
		CommonUtil.printIntArray(array);
		Arrays.sort(array);
		CommonUtil.printIntArray(array);
		System.out.println("Sum ::: " + target);
		
		int arrayLenght = array.length;
		StringBuilder sb;
		for (int i = 0; i < array.length - 2; i++) {
			
			// Skip duplicates for i
			if(i>0 && array[i] == array[i-1]) {
				continue;
			}
			int left = i + 1, right = array.length - 1;
			while(left < right) {
				int sum = array[i]+array[left]+array[right];
				if(sum == target) {
					sb = new StringBuilder();
					sb.append(array[i]).append(" ");
					sb.append(array[left]).append(" ");
					sb.append(array[right]);
					System.out.println(sb.toString());
					left++;
					right--;
					
					
					 // Skip duplicates for j and k
					while(left< arrayLenght && array[left]== array[left-1]) {
						left++;
					}
					
					while(left < right && array[right]== array[left+1]) {
						right++;
					}
				} else if(sum < target) {
					left++;
				} else {
					right--;
				}
			}
		}
		System.out.println("===========================");
	}

}
