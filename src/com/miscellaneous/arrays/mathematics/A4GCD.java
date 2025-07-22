package com.miscellaneous.arrays.mathematics;

public class A4GCD {

	public static void main(String[] args) {
		naiveGCD(10, 15);
		euclideanAlgo(10, 15);
		
		int a = 15, b = 12;
		int result = optimizedEuclideanAlgo(a, b);
		System.out.println(a + " :: " + b + " are given numbers");
		System.out.println("GCD of given two numbers is " + result);
		
	}
	
	private static void naiveGCD(int a, int b) {
		int result = Math.min(a, b);
		while(result > 0) {
			if(a % result == 0 && b % result ==0) {
				break;
			}
			result--;
		}
		
		System.out.println(a + " :: " + b + " are given numbers");
		System.out.println("GCD of given two numbers is " + result);
		
		
	}
	
	private static void euclideanAlgo(int a, int b) {
		while(a != b) {
			if(a > b) {
				a = a-b;
			} else {
				b = b-a;
			}
		}
		System.out.println(a + " :: " + b + " are given numbers");
		System.out.println("GCD of given two numbers is " + a);
	}
	
	private static int optimizedEuclideanAlgo(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return optimizedEuclideanAlgo(b, a%b);
		}
	}

}
