package com.miscellaneous;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		fb.perform(10);
	}
	
	public void perform(int num) {
		int first = 0, second = 1;
		int count = 0;
		int[] series = new int[num];
		while(count < num) {
			series[count] = first;
			first = second;
			second = second + series[count];
			count++;
		}
		System.out.println("The First " + num + " fibonacci elements are ::: ");
		for(int i : series) {
			System.out.print(i + " :: ");
		}
	}
	
	public int performRecursive(int num) {
		if(num <= 1) {
			return num;
		}
		return performRecursive(num-1)+performRecursive(num-2);
	}

}
