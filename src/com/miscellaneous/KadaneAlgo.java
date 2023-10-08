package com.miscellaneous;

public class KadaneAlgo {
	
	public static void main(String[] args) {
		KadaneAlgo ka = new KadaneAlgo();
		ka.anonymous(new int[] {1,2,3,-4,-5,6,7,8});
		ka.anonymous(new int[] {8,7,-6,5,4,-3,-2,1});
		ka.anonymous(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		ka.anonymous(new int[] {-8,-7,-6,-5,-4,-3,-2,-1});
		ka.anonymous(new int[] {4,7,1,9,3,0,8});
		ka.anonymous(new int[] {8,7,1,9,3,0,4});
		ka.anonymous(new int[] {-8,7,1,-9,3,0,4});
	}
	
	public void anonymous(int[] nums) {
		int max = 0;
		int sum = nums[0];
		for(int num : nums) {
			max = num > num+max ? num : num+max;
			sum = sum > max ? sum : max;
		}
		System.out.println("max sub array total is :: "+sum); 
	}

}
