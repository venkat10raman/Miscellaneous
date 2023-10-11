package com.miscellaneous;

import java.util.Arrays;

public class BoyerMoore {

	public static void main(String[] args) {
		BoyerMoore bm = new BoyerMoore();
		bm.perform(new int[] { 1, 1, 1, 1, 2, 3, 4 });
		bm.perform(new int[] { 1, 2, 3, 1, 2, 3, 4 });
		bm.perform(new int[] { 1, 2, 1, 1, 2, 1, 4 });
		
		bm.maxOccurred(new int[] { 1, 1, 1, 1, 2, 3, 4 });
		bm.maxOccurred(new int[] { 1, 2, 3, 2, 2, 3, 4 });
		bm.maxOccurred(new int[] { 1, 2, 1, 1, 2, 1, 4 });
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
			} else if(maxCount < count) {
				maxCount =  count;
				maxElement = element ;
				element = num;
				count = 1;
			} else {
				element = num;
				count = 1;
			}
		}
		System.out.println("Max occured element is :: "+maxElement);
		System.out.println("Max occured :: "+maxCount);
	}

}
