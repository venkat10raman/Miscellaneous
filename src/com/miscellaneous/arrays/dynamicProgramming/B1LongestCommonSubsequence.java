package com.miscellaneous.arrays.dynamicProgramming;

import java.util.Arrays;

public class B1LongestCommonSubsequence {

	public static void main(String[] args) {
		String big = "AXZY";
		String small = "BAZ";
		int result = lcs(big.toCharArray(), small.toCharArray(), big.length(), small.length());
		System.out.println(result);
		
		int[][] dp = new int[big.length()+1][small.length()+1];
		for(int[] row : dp) {
			Arrays.fill(row, -1);
		}
		
		big = "cat";
		small = "ban";
		result = lcs(big.toCharArray(), small.toCharArray(), big.length(), small.length(), dp);
		System.out.println(result);
		
		lcsIterative(big.toCharArray(), small.toCharArray());
	}
	
	private static int lcs(char[] big, char[] small, int m, int n) {
		if(m == 0 || n == 0) {
			return 0;
		}
		
		if(big[m-1] == small[n-1]) {
			return 1+lcs(big, small, m-1, n-1);
		} else {
			return Math.max(lcs(big, small, m-1, n), lcs(big, small, m, n-1));
		}
	}
	
	private static int lcs(char[] big, char[] small, int m, int n, int[][] dp) {
		if(m == 0 || n == 0) {
			dp[m][n] = 0;
			return dp[m][n];
		}
		
		if(dp[m][n] != -1) {
			return dp[m][n];
		}
		
		if(big[m-1] == small[n-1]) {
			return dp[m][n] = 1 + lcs(big, small, m-1, n-1, dp);
		} else {
			dp[m][n] = Math.max(lcs(big, small, m-1, n, dp),
					lcs(big, small, m, n-1, dp));
		}
		return dp[m][n];
	}
	
	private static void lcsIterative(char[] big, char[] small) {
		int m = big.length;
		int n = small.length;
		int[][] dp = new int[m+1][n+1];
		
		for(int i = 1; i <= m ; i++) {
			for(int j = 1; j <= n ; j++) {
				if(big[i-1] == small[j-1]) {
					dp[i][j] = 1 + dp[i-1][j-1];
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println(dp[m][n]);
		System.out.println("--------------");
	}

}
