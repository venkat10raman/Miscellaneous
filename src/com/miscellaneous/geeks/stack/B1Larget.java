package com.miscellaneous.geeks.stack;

import java.util.Arrays;
import java.util.Stack;

public class B1Larget {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,0,0,1,1},
				{0,1,1,1,1},
				{1,1,1,1,1},
				{0,1,1,1,1}
		};
		
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		
		int result = largestRectangle(matrix[0]);
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 1) {
					matrix[i][j] = matrix[i][j] + matrix[i-1][j];
				}
			}
			result = Math.max(result, largestRectangle(matrix[i]));
		}
		System.out.println(result);
	}

	private static int largestRectangle(int[] array) {
		Stack<Integer> stack = new Stack<>();
		int height = 0, width = 0, result = 0, curr = 0;
		
		for (int i = 0; i < array.length; i++) {
			while (!stack.isEmpty() && array[stack.peek()] >= array[i]) {
				height = array[stack.pop()];
				width = stack.isEmpty() ? i : (i-stack.peek()-1);
				curr = height * width;
				result = Math.max(curr, result);
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			height = array[stack.pop()];
			width = stack.isEmpty() ? array.length : (array.length - stack.peek() -1);
			curr = height * width;
			result = Math.max(result, curr);
		}
		return result;
	}

}
