package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class B4StockBuySell {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,12};
		naiveStockProfit(array);
		
		array = new int[]{10,2,80,20,5,6,70};
		naiveStockProfit(array);
		
		array = new int[]{6,5,4,3,2,1};
		naiveStockProfit(array);
	}
	
	private static void naiveStockProfit(int[] array) {
		System.out.println(Arrays.toString(array));
		int size = array.length;
		int maxProfit = 0, currentProfit = 0;
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(array[j] > array[j-1]) {
					currentProfit = currentProfit + array[j] - array[j-1];
					maxProfit = Math.max(maxProfit, currentProfit);
				}
			}
			currentProfit = 0;
		}
		System.out.println("Max Profit is :: " + maxProfit);
		stockMaximumProfit(array);
		System.out.println("-----------------------------");
	}
	
	private static void stockMaximumProfit(int[] array) {
		int size = array.length;
		int profit = 0;
		for(int i=1; i<size; i++) {
			if(array[i] > array[i-1]) {
				profit = profit + array[i] - array[i-1];
			}
		}
		System.out.println("Max Profit is :: " + profit);
	}

}
