package com.miscellaneous.arrays.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class A3SubSetSumAll {

	public static void main(String[] args) {
		int[] arr = {6,1, 3, 2, 1,1,1,1};
		int targetSum = 5;
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Target Sum: " + targetSum);
		ArrayList<ArrayList<Integer>> result = findAllSubsetsWithSum(arr, targetSum);
		if (!result.isEmpty()) {
			System.out.println("All subsets with sum " + targetSum + ":");
			for (ArrayList<Integer> subset : result) {
				System.out.println(subset);
			}
		} else {
			System.out.println("No subsets found with the given sum");
		}
	}

	private static ArrayList<ArrayList<Integer>> findAllSubsetsWithSum(int[] arr, int targetSum) {
		ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<>();
		findSubsets(arr, targetSum, 0, new ArrayList<Integer>(), allSubsets);
		return allSubsets;
	}

	private static void findSubsets(int[] arr, int targetSum, int index, ArrayList<Integer> current,
			ArrayList<ArrayList<Integer>> allSubsets) {
		// Base case: if target sum is 0, add current subset to result
		if (targetSum == 0) {
			allSubsets.add(new ArrayList<>(current));
			return;
		}

		// If index exceeds array length or target sum becomes negative, stop
		if (index >= arr.length || targetSum < 0) {
			return;
		}
		
		// Include current element
		current.add(arr[index]);
		findSubsets(arr, targetSum-arr[index], index+1, current, allSubsets);
	
		// Exclude current element
        current.remove(current.size() - 1);
        findSubsets(arr, targetSum, index + 1, current, allSubsets);
	}

}
