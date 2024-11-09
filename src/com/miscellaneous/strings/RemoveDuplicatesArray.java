package com.miscellaneous.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.miscellaneous.util.CommonUtil;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		RemoveDuplicatesArray rda = new RemoveDuplicatesArray();
		int[] arr = {1, 1, 9, 8, 3, 3, 2, 3};
		rda.usingMap(arr);
//		rda.usingSort(arr);
		
	}
	
	public void usingMap(int[] nums) {
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for(int num : nums) {
			int count = 1;
			if(freqMap.containsKey(num)) {
				count = freqMap.get(num);
				count++;
			}
			freqMap.put(num, count);
		}
		
		for(Entry<Integer, Integer> entry : freqMap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public void usingSort(int[] nums) {
		Arrays.sort(nums);
		int freq = 0;
		int i = 0,j = 0;
		int temp = nums[0];
		int[] arr = new int[nums.length];
		
		while(i  < nums.length) {
			int currNum = nums[i++];
			if(temp == currNum) {
				freq++;
			} else {
				if(freq == 1) {
					arr[j++] = temp;
				}
				temp = currNum;
				freq = 1;
			}
		}
		if(freq == 1) {
			arr[j++] = temp;
		}
		CommonUtil.printIntArray(arr, j);
	}

}
