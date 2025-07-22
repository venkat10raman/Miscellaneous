package com.miscellaneous.arrays.dynamicProgramming;

public class A9FrogJump {
	/*
	You are climbing a staircase. It takes n steps to reach the top.
	Each time you can either climb 1 or 2 steps. 
	In how many distinct ways can you climb to the top
	*/
	public static void main(String[] args) {
		int steps = 5;
		
		System.out.println("No of Steps :: " + steps);
		System.out.println("No of ways :: " + climbStairs(steps));
	}
	
	private static int climbStairs(int steps) {
		if(steps <= 2) return steps;
		int first = 1, second = 2, third = 0;
		for(int i=3; i<=steps; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		return second;
	}

}
