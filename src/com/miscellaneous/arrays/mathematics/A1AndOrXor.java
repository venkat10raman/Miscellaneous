package com.miscellaneous.arrays.mathematics;

public class A1AndOrXor {

	public static void main(String[] args) {
		int m = 3, n = 6;
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(n));
		System.out.println(m & n);
		System.out.println(Integer.toBinaryString(m & n));
		System.out.println(m | n);
		System.out.println(Integer.toBinaryString(m | n));
		System.out.println(m ^ n);
		System.out.println(Integer.toBinaryString(m ^ n));
		System.out.println(~m);
		System.out.println(Integer.toBinaryString(~m));
		
		System.out.println(m << 2);
		System.out.println(Integer.toBinaryString(m << 2));
		
		int x = -1;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(x << 2);
		System.out.println(Integer.toBinaryString(x << 2));
		
		System.out.println(x >> 2);
		System.out.println(Integer.toBinaryString(x >> 2));
		
		
	}
	

}
