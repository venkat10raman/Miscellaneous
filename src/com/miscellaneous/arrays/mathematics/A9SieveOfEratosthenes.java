package com.miscellaneous.arrays.mathematics;

import java.util.Arrays;

public class A9SieveOfEratosthenes {

	public static void main(String[] args) {
		sieve(100);
		sieveBetter(100);
		sieveBest(100);
	}
	
	private static void sieve(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		for(int i=2; i*i < n ; i++) {
			if(isPrime[i]) {
				for(int j=2*i; j<=n; j=i+j) {
					isPrime[j] = false;
				}
			}
		}
		printPrimeNumbers(isPrime, n);
		
	}
	
	private static void sieveBetter(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		for(int i = 2; i*i < n; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j <= n; j=j+i) {
					isPrime[j] = false;
				}
			}
		}
		printPrimeNumbers(isPrime, n);
		
	}
	
	private static void sieveBest(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		for(int i=2; i <= n; i++) {
			if(isPrime[i]) {
				System.out.print(i + " ");
				for(int j = i*i; j<=n; j=j+i) {
					isPrime[j] = false;
				}
			}
		}
	}
	
	private static void printPrimeNumbers(boolean[] isPrime, int n) {
		int count = 0;
		for(int i=2; i <= n ; i++) {
			if(isPrime[i]) {
				count++;
				if(count < 10) {
					System.out.print(i + " ");
				} else {
					System.out.println(i);
					count = 1;
				}
			}
		}
		System.out.println("\n--------------------");
	}

}
