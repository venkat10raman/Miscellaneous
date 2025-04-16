package com.miscellaneous.arrays;

import com.miscellaneous.util.CommonUtil;

public class C26HouseRobbery {

	public static void main(String[] args) {
		int[] houses = {2, 7, 9, 3, 1};
		maxRob(houses);
		maxRob(new int[] {1,6,8,2,5,9});
		maxRob(new int[] {1,6,2,3,5,4});
	}
	
	private static void maxRob(int[] nums) {
		if (nums == null || nums.length == 0) {
			System.out.println("No House to rob");
		}
		CommonUtil.printIntArray(nums);
		System.out.print("Max amount that can be robbed is ::: ");
		int lenght = nums.length;
        if (lenght == 1) {
        	System.out.print(nums[0]);
        }
        
        int[] dp = new int[lenght];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < lenght; i++) {
        	dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
        }
        
        System.out.println(dp[lenght-1]);
        System.out.println("------------");
	}

}
