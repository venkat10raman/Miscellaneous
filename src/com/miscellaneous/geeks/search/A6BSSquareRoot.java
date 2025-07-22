package com.miscellaneous.geeks.search;

public class A6BSSquareRoot {

	public static void main(String[] args) {
		naiveSquareRoot(37);
		squareRoot(24);
	}

	private static void naiveSquareRoot(int input) {
		int i = 1;
		while(i*i < input) {
			i++;
		}
		i--;
		System.out.println("Square root of " + input + " is " + i);
	}
	
	private static void squareRoot(int input) {
		int low = 1, high = input, ans = -1, mid = 0;
		while(low <= high) {
			mid = (low+high)/2;
			int root = mid * mid;
			if(root == input) {
				ans = root;
				break;
			} else if(root > input) {
				high = mid-1;
			} else {
				low = mid + 1;
				ans = mid;
			}
		}
		System.out.println("Square root of " + input + " is " + ans);
	}

}
