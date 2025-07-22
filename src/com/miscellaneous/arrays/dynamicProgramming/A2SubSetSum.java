package com.miscellaneous.arrays.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class A2SubSetSum {

	public static void main(String[] args) {
		int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target Sum: " + targetSum);
        ArrayList<Integer> result = findSubsetWithSum(arr, targetSum);
        if (result != null) {
            System.out.println("Subset with sum " + targetSum + ": " + result);
        } else {
            System.out.println("No subset found with the given sum");
        }
	}

	private static ArrayList<Integer> findSubsetWithSum(int[] arr, int targetSum) {
		ArrayList<Integer> result = new ArrayList<>();
		if(findSubset(arr, targetSum, 0, result)) {
			return result;
		}
		return null;
	}

	private static boolean findSubset(int[] arr, int targetSum, int index, ArrayList<Integer> result) {
		// Base case: if target sum is 0, we found a valid subset
		if(targetSum == 0) {
			return true;
		}
		
		// Base case: if index reaches array length or 
		//target sum becomes negative, no solution
		if(index >= arr.length || targetSum < 0) {
			return false;
		}
		
		// Include current element
		result.add(arr[index]);
		if(findSubset(arr, targetSum - arr[index], index+1, result)) {
			return true;
		}
		
		// Exclude current element
		result.remove(result.size() - 1);
		return findSubset(arr, targetSum, index+1, result);
	}

}
