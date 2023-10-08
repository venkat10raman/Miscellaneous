package com.miscellaneous;

public class SecondLargest {

	public static void main(String[] args) {
		SecondLargest sl = new SecondLargest();
		sl.anonymous(new int[] {1,2,3,4,5,6,7,8});
		sl.anonymous(new int[] {8,7,6,5,4,3,2,1});
		sl.anonymous(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		sl.anonymous(new int[] {-8,-7,-6,-5,-4,-3,-2,-1});
		sl.anonymous(new int[] {4,7,1,9,3,0,8});
		sl.anonymous(new int[] {8,7,1,9,3,0,4});
		sl.anonymous(new int[] {-8,7,1,-9,3,0,4});
	}
	
	private void anonymous(int[] nums) {
		int max = nums[0];
		int secMax = max;
		
		for(int num : nums) {
			if(max < num) {
				secMax = max;
				max = num;
			} else if(max > num && (secMax < num || secMax == max)) {
				secMax = num;
			}
		}
		
		System.out.println("second max is :: "+secMax);
	}

}
