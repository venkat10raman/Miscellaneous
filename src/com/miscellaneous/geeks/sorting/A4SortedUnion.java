package com.miscellaneous.geeks.sorting;

public class A4SortedUnion {

	public static void main(String[] args) {
		int[] a = {1,2,2,3,3,4,5};
		int[] b = {1,2,2,2,2,3,3,3,3,3};
		union(a,b);
	}

	private static void union(int[] a, int[] b) {
		int i=0, j=0, m=a.length, n=b.length;
		
		while(i<m && j<n) {
			if(i>0 && a[i] == a[i-1]) {
				i++;
				continue;
			}
			if(j>0 && b[j] == b[j-1]) {
				j++;
				continue;
			}
			
			if(a[i] == b[j]) {
				System.out.print(a[i] + " -> ");
				i++;
				j++;
			} else if(a[i] < b[j]) {
				System.out.print(a[i] + " -> ");
				i++;
			} else {
				System.out.print(b[j] + " -> ");
				j++;
			}
		}
		while(i<m) {
			if(i>0 && a[i] != a[i-1]) {
				System.out.print(a[i] + " -> ");
			}
			i++;
		}
		
		while(j<n) {
			if(j>0 && b[j] != b[j-1]) {
				System.out.print(b[j] + " -> ");
			}
			j++;
		}
		System.out.println(" end");
		System.out.println("----------");
	}

}
