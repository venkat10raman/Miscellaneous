package com.miscellaneous.arrays.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A8FrogJumpCombinations {

	public static void main(String[] args) {
		int[] jumps = {1, 3, 5}; // frog can jump 1, 3, or 5 steps
        int steps = 6;
        
        findPaths(jumps, steps);
	}

	private static void findPaths(int[] jumps, int steps) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(jumps, steps, new ArrayList<>(), result);
		
		System.out.println(Arrays.toString(jumps));
		System.out.println("Steps to reach : " + steps);
		System.out.println("Total unique paths: " + result.size());
        for (List<Integer> path : result) {
            System.out.println(path);
        }
	}

	private static void backtrack(int[] jumps, int remainingSteps, List<Integer> current, List<List<Integer>> result) {
		if(remainingSteps == 0) {
			result.add(new ArrayList<>(current));
			return;
		}
		
		// If remainingSteps is negative, stop this path
		if(remainingSteps < 0) {
			return;
		}
		
		for (int jump : jumps) {
			if(jump <= remainingSteps) {
				// Include the current jump
				current.add(jump);
				// reuse current jump
				backtrack(jumps, remainingSteps-jump, current, result);
				// backtrack by removing the last jump
				current.remove(current.size()-1);
			}
		}
		
	}

}
