package com.miscellaneous.arrays.mathematics;

public class A5LCM {

	public static void main(String[] args) {
		// a*b = gcd(a,b) * lcm(a,b)
		
		int a = 15, b = 12;
		int result = gcd(a,b);

		System.out.println(a + " :: " + b + " are given numbers");
		System.out.println("GCD of given two numbers is " + result);
		System.out.println("LCM of given two numbers is " + (a*b)/result);
	}

	private static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}

}
