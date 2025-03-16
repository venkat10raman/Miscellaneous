package com.miscellaneous.arrays;

import java.util.HashSet;

import com.miscellaneous.util.CommonUtil;

public class C21LongestConsecutive {

	public static void main(String[] args) {
		int[] nums = {100, 4, 200, 1, 3, 2};
		longestConsecutive(nums);
	}
	
	private static void longestConsecutive(int[] array) {
		CommonUtil.printIntArray(array);
		HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        
        int longestStreak = 0;
        for(int num : set) {
        	if(!set.contains(num-1)) {
        		int currentNum = num;
                int currentStreak = 1;
                
                while(set.contains(currentNum+1)) {
                	currentNum++;
                	currentStreak++;
                }
                longestStreak = Math.max(currentStreak, longestStreak);
        	}
        }
        System.out.println("Longest streak length :: "+longestStreak);
	}

}
