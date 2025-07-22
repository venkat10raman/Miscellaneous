package com.miscellaneous.arrays.mathematics;

public class A6PrimeNumber {

	public static void main(String[] args) {
		prime(23);
		prime(24);
		
		optimizedPrime(23);
		optimizedPrime(139);
	}
	
	private static void prime(int n) {
		System.out.println("Given number is :: "+ n);
		
		if(n == 1) {
			System.out.println("Given number is not a prime number");
			return;
		}
		if(n == 2) {
			System.out.println("Given number is a prime number");
			return;
		}
		if(n == 3) {
			System.out.println("Given number is a prime number");
			return;
		}
		
		
		if(n%2 == 0) {
			System.out.println("Given number is not a prime number");
			System.out.println("Given number is divisible by " + 2);
			return;
		}
		if(n%3 == 0) {
			System.out.println("Given number is not a prime number");
			System.out.println("Given number is divisible by " + 3);
			return;
		}
		
		boolean isPrime = true;
		for(int i = 5; i*i < n ; i = i+2) {
			if(n % i == 0) {
				System.out.println("Given number is divisible by " + i);
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Given number is a prime number");
		} else {
			System.out.println("Given number is not a prime number");
		}
		
		System.out.println("-----------");
	}
	
	
	private static void optimizedPrime(int n) {
		System.out.println("Given number is :: "+ n);
		if(n == 1) {
			System.out.println("Given number is not a prime number");
			return;
		}
		if(n == 2) {
			System.out.println("Given number is a prime number");
			return;
		}
		if(n == 3) {
			System.out.println("Given number is a prime number");
			return;
		}
		
		
		if(n%2 == 0) {
			System.out.println("Given number is not a prime number");
			System.out.println("Given number is divisible by " + 2);
			return;
		}
		if(n%3 == 0) {
			System.out.println("Given number is not a prime number");
			System.out.println("Given number is divisible by " + 3);
			return;
		}
		
		boolean isPrime = true;
		for(int i = 5; i*i < n ; i = i+6) {
			if(n % i == 0) {
				System.out.println("Given number is divisible by " + i);
				isPrime = false;
				break;
			} else if(n % (i+2) == 0) {
				System.out.println("Given number is divisible by " + (i+2));
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Given number is a prime number");
		} else {
			System.out.println("Given number is not a prime number");
		}
		
		System.out.println("-----------");
	}

}
