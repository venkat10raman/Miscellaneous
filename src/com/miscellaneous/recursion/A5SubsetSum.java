package com.miscellaneous.recursion;

public class A5SubsetSum {

	public static void main(String[] args) {
		int[] arr = {10, 20, 15,5};
		int targetSum = 25;
		int result = countSubset(arr, arr.length-1, targetSum);
		System.out.println("The possible subset size is :: " + result);
		
		arr = new int[]{6,1,3,2,-1,4};
		targetSum = 5;
		result = countSubset(arr, arr.length-1, targetSum);
		System.out.println("The possible subset size is :: " + result);
		
	}
	
	private static int countSubset(int[] array, int index, int sum) {
		if(sum == 0) return 1;
		if(index < 0) return 0;
		
		// exclude element + include element
		return countSubset(array, index-1, sum) 
				+ countSubset(array, index-1, sum-array[index]);
	}

}
