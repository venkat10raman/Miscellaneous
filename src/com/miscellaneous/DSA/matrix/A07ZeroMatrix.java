package com.miscellaneous.DSA.matrix;

public class A07ZeroMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 1, 1},
				{1, 0, 1},
				{1, 1, 1}
		};

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		setZeroes(matrix);

		System.out.println("\nMatrix after setting zeroes:");
		printMatrix(matrix);
	}

	private static void setZeroes(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return;
		}

		int rows = matrix.length;
		int columns = matrix[0].length;

		for(int[] row : matrix) {
			if(row.length != columns) {
				throw new IllegalArgumentException("Inconsistent row lengths in matrix");
			}
		}

		// Arrays to mark rows and columns with zeros
		boolean[] zeroRows = new boolean[rows];
		boolean[] zeroCols = new boolean[columns];

		// Mark rows and columns that contain zeros
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (matrix[i][j] == 0) {
					zeroRows[i] = true;
					zeroCols[j] = true;
				}
			}
		}

		// Set rows to zero
		for (int i = 0; i < rows; i++) {
			if (zeroRows[i]) {
				for (int j = 0; j < columns; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		// Set columns to zero
		for (int j = 0; j < columns; j++) {
			if (zeroCols[j]) {
				for (int i = 0; i < rows; i++) {
					matrix[i][j] = 0;
				}
			}
		}
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
