package com.miscellaneous;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import com.miscellaneous.util.CommonUtil;

public class BoyerMoore {

	public static void main(String[] args) {
		BoyerMoore bm = new BoyerMoore();
		
		Random random = new Random();
		IntStream.range(0, 10).forEach(i -> {
			int[] arr = new int[10];
			
			IntStream.range(0, 10).forEach(j -> {
				arr[j] = random.nextInt(1, 5);
			});
			
			CommonUtil.printIntArray(arr);
			
			bm.perform(arr);
			bm.maxOccurred(arr);
		});
		
	}
	
	public void perform(int[] nums) {
		int element = 0, votes = 0;
		
		for(int num : nums) {
			if(votes == 0) {
				element = num;
				votes = 1;
			} else if(num == element) {
				votes++;
			} else {
				votes--;
			}
		}
		
		int count = 0;
		for(int num : nums) {
			if(num == element)
				count++;
		}
		
		if(count > nums.length/2) {
			System.out.println("The majority element is : "+ element);
		} else {
			System.out.println("There is no majority element");
		}
	}
	
	public void maxOccurred(int[] nums) {
		Arrays.sort(nums);
		
		int maxCount = 0, count = 0;
		int maxElement = nums[0], element = nums[0];
		for(int num : nums) {
			if(num == element) {
				count++;
			} else {
				if(maxCount < count) {
					maxCount =  count;
					maxElement = element ;
				}
				element = num;
				count = 1;
			}
		}
		
		if(maxCount < count) {
			maxCount =  count;
			maxElement = element ;
		}
		System.out.println("MOE-WS element :: "+maxElement);
		System.out.println("MOE-WS occured :: "+maxCount);
	}

}
