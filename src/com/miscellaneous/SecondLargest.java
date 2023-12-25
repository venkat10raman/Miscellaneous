package com.miscellaneous;

import java.util.Random;
import java.util.stream.IntStream;

import com.miscellaneous.util.CommonUtil;

public class SecondLargest {

	public static void main(String[] args) {
		SecondLargest sl = new SecondLargest();
		
		Random random = new Random();
		IntStream.range(0, 10).forEach(i -> {
			int[] arr = new int[10];
			IntStream.range(0, 10).forEach(j -> {
				arr[j] = random.nextInt(-20, 20);
			});
			
			CommonUtil.printIntArray(arr);
			sl.anonymous(arr);
		});
	}
	
	private void anonymous(int[] nums) {
		int max = nums[0];
		int secMax = max;
		
		for(int num : nums) {
			if(max < num) {
				secMax = max;
				max = num;
			} else if(max > num && (secMax < num || secMax == max)) {
				secMax = num;
			}
		}
		
		System.out.println("second max is :: "+secMax);
	}

}
