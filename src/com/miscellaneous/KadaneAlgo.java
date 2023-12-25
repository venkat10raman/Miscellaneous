package com.miscellaneous;

import java.util.Random;
import java.util.stream.IntStream;

import com.miscellaneous.util.CommonUtil;

public class KadaneAlgo {
	
	public static void main(String[] args) {
		KadaneAlgo ka = new KadaneAlgo();
		
		Random random = new Random();
		IntStream.range(0, 10).forEach(j -> {
			int[] arr = new int[10];
			IntStream.range(0, 10).forEach(i -> {
				arr[i] = random.nextInt(-20, 20);
			});
			
			CommonUtil.printIntArray(arr);
			ka.anonymous(arr);
		});
	}
	
	public void anonymous(int[] nums) {
		int tempSum = 0;
		int currMax = tempSum;
		int max = nums[0];
		for(int num : nums) {
			tempSum = num+currMax;
			currMax = num > tempSum ? num : tempSum;
			max = max > currMax ? max : currMax;
		}
		System.out.println("max sub array total is :: "+max); 
	}

}
