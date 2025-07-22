package com.miscellaneous.DSA.matrix;

import java.util.stream.IntStream;

public class A01MatrixMultiplication {

	public static void main(String[] args) {
		try {
			int[][] A = {{1, 2}, {3, 4}}; // 2x2 matrix
			int[][] B = {{5, 6}, {7, 8}}; // 2x2 matrix
			int[][] C = multiplyMatrices(A, B);

			System.out.println("Matrix A:");
			printMatrix(A);
			System.out.println("Matrix B:");
			printMatrix(B);
			System.out.println("Result Matrix C:");
			printMatrix(C);

			C = multiplyMatrixStreams(A, B);
			System.out.println("Result Matrix C:");
			printMatrix(C);
			int[][] invalidB = {{1}, {2, 3}}; // Incompatible
			multiplyMatrices(A, invalidB); // Throws exception
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static int[][] multiplyMatrices(int[][] a, int[][] b) {
		// Validate inputs
		if (a == null || b == null || a.length == 0 || b.length == 0) {
			throw new IllegalArgumentException("Matrices cannot be null or empty");
		}

		int arow = a.length;
		int acolumn = a[0].length;
		int brow = b.length;
		int bcolumn = b[0].length;

		// Check compatibility
		if(acolumn != brow) {
			throw new IllegalArgumentException("Number of columns in A must equal number of rows in B");
		}

		for(int[] row : a) {
			if(row.length != acolumn) {
				throw new IllegalArgumentException("Inconsistent row lengths in matrix A");
			}
		}

		for(int[] row : b) {
			if(row.length != bcolumn) {
				throw new IllegalArgumentException("Inconsistent row lengths in matrix B");
			}
		}

		int[][] result = new int[arow][bcolumn];
		for(int i=0 ; i < arow ; i++) {
			for(int j=0 ; j < bcolumn ; j++) {
				for(int k=0 ; k < acolumn ; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	private static int[][] multiplyMatrixStreams(int[][] a, int[][] b){

		// Validate inputs
		if (a == null || b == null || a.length == 0 || b.length == 0) {
			throw new IllegalArgumentException("Matrices cannot be null or empty");
		}

		int arow = a.length;
		int acolumn = a[0].length;
		int brow = b.length;
		int bcolumn = b[0].length;

		// Check compatibility
		if(acolumn != brow) {
			throw new IllegalArgumentException("Number of columns in A must equal number of rows in B");
		}

		for(int[] row : a) {
			if(row.length != acolumn) {
				throw new IllegalArgumentException("Inconsistent row lengths in matrix A");
			}
		}

		for(int[] row : b) {
			if(row.length != bcolumn) {
				throw new IllegalArgumentException("Inconsistent row lengths in matrix B");
			}
		}

		int[][] result = new int[arow][bcolumn];
		IntStream.range(0, arow).forEach(i -> {
			IntStream.range(0, bcolumn).forEach(j -> {
				result[i][j] = IntStream.range(0, acolumn)
						.map(k -> a[i][k] * b[k][j])
						.sum();
			});
		});

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
