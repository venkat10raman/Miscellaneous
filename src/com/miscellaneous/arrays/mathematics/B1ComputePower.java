package com.miscellaneous.arrays.mathematics;

public class B1ComputePower {

	public static void main(String[] args) {
		int result = recursivePower(2, 6);
		System.out.println(result);
		iterativePower(4, 5);
	}
	
	private static int recursivePower(int n, int p) {
		if(p == 0) return 1;
		if(p == 1) return n;
		int temp = recursivePower(n, p/2);
		temp = temp * temp;
		if(p%2 == 0) {
			return temp ;
		} else {
			return temp * n;
		}
	}
	
	private static void iterativePower(int n, int p) {
		int result = 1;
		while(p > 0) {
			if(p % 2 == 1) {
				result = result * n;
			}
			n = n*n;
			p = p/2;
		}
		
		System.out.println(result);
	}

}
