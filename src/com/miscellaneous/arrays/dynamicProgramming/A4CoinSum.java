package com.miscellaneous.arrays.dynamicProgramming;

import java.util.Arrays;

public class A4CoinSum {

	public static void main(String[] args) {
		int[] coins = {1, 2, 3};
		int target = 4;
		System.out.println("Coin denominations: " + Arrays.toString(coins));
		System.out.println("Target amount: " + target);
		int result = coinChangeMinimum(coins, target);
		if (result != -1) {
			System.out.println("Minimum number of coins needed: " + result);
		} else {
			System.out.println("No combination of coins can make the target amount.");
		}

		result = coinChangeWays(coins, target);
		System.out.println("Total Number of coins combinations: " + result);
	}

	private static int coinChangeMinimum(int[] coins, int target) {
		// dp[i] represents the minimum number of coins needed to make amount i
		int[] dp = new int[target+1];

		// Initialize with a value greater than max possible coins
		Arrays.fill(dp, target+1);

		// Base case: 0 coins needed to make amount 0
		dp[0] = 0;

		// Compute minimum coins for each amount from 1 to target

		// Try each coin denomination
		for(int coin : coins) {
			for(int amount=coin; amount<=target; amount++) {
				dp[amount] = Math.min(dp[amount], dp[amount-coin]+1);
			}
		}

		// Return -1 if no solution exists, 
		// otherwise return the minimum coins
		return dp[target] > target ? -1 : dp[target];
	}

	private static int coinChangeWays(int[] coins, int target) {
		// dp[i] represents the minimum number of coins needed to make amount i
		int[] dp = new int[target+1];

		// Base case: 1 coins needed to make amount 0
		dp[0] = 1;

		//for each amount count from 1 to target
		for(int coin : coins) {
			for (int amount = coin; amount <= target; amount++) {
				dp[amount] += dp[amount-coin];
			}
		}

		return dp[target];
	}
}
