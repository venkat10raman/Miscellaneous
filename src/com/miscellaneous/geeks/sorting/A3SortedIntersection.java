package com.miscellaneous.geeks.sorting;

public class A3SortedIntersection {

	public static void main(String[] args) {
		int[] a = {1,2,2,3,3,4,5};
		int[] b = {1,2,2,2,2,3,3,3,3,3};
		intersection(a,b);
		
		a = new int[] {10,20,20, 40,60};
		b = new int[] {2,20,20,20};
		intersection(a, b);
	}

	private static void intersection(int[] a, int[] b) {
		int i=0, j=0, m=a.length, n=b.length;
		while(i<m && j<n) {
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			if(a[i] < b[j]) {
				i++;
			} else if(a[i] > b[j]) {
				j++;
			} else {
				System.out.print(a[i] + " --> ");
				i++;
				j++;
			}
		}
		System.out.println("end");
		System.out.println("---------------------");
	}

}
