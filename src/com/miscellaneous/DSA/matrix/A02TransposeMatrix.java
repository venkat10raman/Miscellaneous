package com.miscellaneous.DSA.matrix;

import java.util.stream.IntStream;

public class A02TransposeMatrix {

	public static void main(String[] args) {
		int[][] A = {{1, 2, 3}, {4, 5, 6}}; // 2x3 matrix
		System.out.println("Matrix A:");
		printMatrix(A);
		
		int[][] result = transposeMatrix(A);
		System.out.println("Transpose of Matrix A:");
		printMatrix(result);
	}

	private static int[][] transposeMatrix(int[][] a) {
		// Validate inputs
		if (a == null || a.length == 0) {
			throw new IllegalArgumentException("Matrix cannot be null or empty");
		}
		int row = a.length;
		int column = a[0].length;
		
		for(int[] m : a) {
			if(m.length != column) {
				throw new IllegalArgumentException("Inconsistent row lengths in matrix A");
			}
		}
		int[][] result = new int[column][row];
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				result[j][i] = a[i][j];
			}
		}
		
		int[][] c = new int[column][row];
		IntStream.range(0, row).forEach(i -> {
			IntStream.range(0, column).forEach(j -> {
				c[j][i] = a[i][j];
			});
		});
		
		System.out.println("Transpose of Matrix A:");
		printMatrix(c);
		return result;
	}

	private static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for(int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
