package com.miscellaneous.arrays.dynamicProgramming;

import java.util.Arrays;

public class A6FrogJump {

	public static void main(String[] args) {
		int[] steps = {1,2,3};
		int target = 4;

		System.out.println("Step sizes: " + Arrays.toString(steps));
		System.out.println("Total steps to climb: " + target);
		long result = countWaysToClimb(steps, target);
		System.out.println("Number of ways to climb: " + result);
	}

	private static long countWaysToClimb(int[] jumps, int target) {
		if (target < 0 || jumps == null || jumps.length == 0) {
			return 0;
		}

		// dp[i] represents the number of ways to climb i steps
		long[] dp = new long[target + 1];

		// Base case: there is 1 way to climb 0 steps (do nothing)
		dp[0] = 1;

		// For each step count from 1 to n
		for (int i = 1; i <= target; i++) {
			// For each possible step size
			for(int jump : jumps) {
				if(jump <= i) {
					dp[i] = dp[i] + dp[i-jump];
				}
			}
		}
		return dp[target];
	}

}
