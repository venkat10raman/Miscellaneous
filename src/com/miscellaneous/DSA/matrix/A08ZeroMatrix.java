package com.miscellaneous.DSA.matrix;

public class A08ZeroMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{0, 1, 2, 0},
				{3, 4, 5, 2},
				{1, 3, 1, 5}
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
		for (int[] row : matrix) {
			if (row.length != columns) {
				throw new IllegalArgumentException("Inconsistent row lengths in matrix");
			}
		}

		// Use first row and column as markers
		boolean firstRowZero = false;
		boolean firstColZero = false;

		// Check if first row has any zero
		for (int j = 0; j < rows; j++) {
			if (matrix[0][j] == 0) {
				firstRowZero = true;
				break;
			}
		}

		// Check if first column has any zero
		for (int i = 0; i < columns; i++) {
			if (matrix[i][0] == 0) {
				firstColZero = true;
				break;
			}
		}

		// Use first row and column to mark zeros for other rows/columns
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < columns; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0; // Mark first cell of row
					matrix[0][j] = 0; // Mark first cell of column
				}
			}
		}

		// Set rows to zero based on first column markers
		for (int i = 1; i < rows; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 1; j < columns; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		// Set columns to zero based on first row markers
		for (int j = 1; j < columns; j++) {
			if (matrix[0][j] == 0) {
				for (int i = 1; i < rows; i++) {
					matrix[i][j] = 0;
				}
			}
		}

		// Set first row to zero if needed
		if (firstRowZero) {
			for (int j = 0; j < columns; j++) {
				matrix[0][j] = 0;
			}
		}

		// Set first column to zero if needed
		if (firstColZero) {
			for (int i = 0; i < rows; i++) {
				matrix[i][0] = 0;
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
