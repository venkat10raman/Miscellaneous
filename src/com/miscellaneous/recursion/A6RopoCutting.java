package com.miscellaneous.recursion;

public class A6RopoCutting {

	public static void main(String[] args) {
		int result = ropeCutting(24, 9, 8, 7);
		System.out.println(result);
		
		result = ropeCutting(24, new int[]{7,8,9}, 0);
		System.out.println(result);
	}
	
	private static int ropeCutting(int ropeLength, int a, int b, int c) {
		if(ropeLength < 0) return 0;
		
		if(ropeLength == 0) return 1;
		
		int x = ropeCutting(ropeLength-a, a, b, c);
		int y = ropeCutting(ropeLength-b, a, b, c);
		int z = ropeCutting(ropeLength-c, a, b, c);
		
		return x + y + z ; 
	}
	
	private static int ropeCutting(int ropeLength, int[] cuts, int result) {
		if(ropeLength == 0) return 1;
		if(ropeLength < 0) return 0;
		
		for(int cut : cuts) {
			if(ropeCutting(ropeLength-cut, cuts, result) == 1) {
				result++;
			}
		}
		return result;
	}

}
