package com.miscellaneous.DSA.matrix;

public class A03TransposeSquareMatrix {

	public static void main(String[] args) {
		int[][] A = {{1, 2}, {4, 5}}; // 2x2 matrix
		System.out.println("Matrix A:");
		printMatrix(A);

		transposeMatrix(A);

		System.out.println("Transpose of Matrix A:");
		printMatrix(A);

		int[][] B = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3x3 matrix
		System.out.println("Matrix B:");
		printMatrix(B);

		transposeMatrix(B);

		System.out.println("Transpose of Matrix B:");
		printMatrix(B);
	}

	private static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for(int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	private static void transposeMatrix(int[][] a) {
		// Validate inputs
		if (a == null || a.length == 0) {
			throw new IllegalArgumentException("Matrix cannot be null or empty");
		}
		int row = a.length;
		int column = a[0].length;

		if(row != column) {
			throw new IllegalArgumentException("Given Matrix is not Square");
		}

		for(int[] m : a) {
			if(m.length != column) {
				throw new IllegalArgumentException("Inconsistent row lengths in matrix A");
			}
		}

		int temp = 0;
		for(int i=0; i<row; i++) {
			for(int j=i+1; j<column; j++) {
				temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	}

}
