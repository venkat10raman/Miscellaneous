package com.miscellaneous.recursion;

public class A3TowerOfHanoi {

	public static void main(String[] args) {
		towerOfHanoi(2, "A", "B" , "C");
		System.out.println("----------");
		towerOfHanoi(3, "A", "B" , "C");
		
	}

	private static void towerOfHanoi(int n, String from, String aux, String to) {
		if(n==1) {
			System.out.println("Move Disc " + n + " From " + from + " To " + to);
			return;
		}
		
		towerOfHanoi(n-1, from, to, aux);
		System.out.println("Move Disc" + (n-1) + " From " + from + " To " + to);
		towerOfHanoi(n-1, aux, from, to);
	}

}
