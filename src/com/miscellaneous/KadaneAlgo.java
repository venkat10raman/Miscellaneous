package com.miscellaneous;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class KadaneAlgo {
	
	public static void main(String[] args) {
		KadaneAlgo ka = new KadaneAlgo();
		IntStream.range(0, 10).forEach(j -> {
			int[] arr = new int[10];
			Random random = new Random();
			IntStream.range(0, 10).forEach(i -> {
				arr[i] = random.nextInt(-100, 100);
			});
			
			String sep = "";
			for(int a : arr) {
				System.out.print(sep + a);
				sep = ", ";
			}
			System.out.println();
			ka.anonymous(arr);
		});
	}
	
	public void anonymous(int[] nums) {
		int max = 0;
		int sum = nums[0];
		for(int num : nums) {
			max = num > num+max ? num : num+max;
			sum = sum > max ? sum : max;
		}
		System.out.println("max sub array total is :: "+sum); 
	}

}
