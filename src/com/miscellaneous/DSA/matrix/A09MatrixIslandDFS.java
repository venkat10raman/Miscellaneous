package com.miscellaneous.DSA.matrix;

public class A09MatrixIslandDFS {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 1, 0, 0, 0},
				{1, 1, 0, 1, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 1, 1}
		};

		System.out.println("Original Grid:");
		printMatrix(matrix);
		int islands = numIslands(matrix);
		System.out.println("\nNumber of Islands: " + islands);
		System.out.println("\nGrid after DFS (visited cells marked as 0):");
		printMatrix(matrix);
	}

	private static int numIslands(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}

		int rows = matrix.length;
		int columns = matrix[0].length;

		for(int[] row : matrix) {
			if(row.length != columns) {
				throw new IllegalArgumentException("Inconsistent row lengths in grid");
			}
		}

		int islands = 0;

		// Scan each cell
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				if(matrix[i][j] == 1) {
					islands++;
					dfs(matrix, i, j, rows, columns);
				}
			}
		}
		return islands;
	}

	private static void dfs(int[][] matrix, int i, int j, int rows, int columns) {
		// Check boundaries and if cell is unvisited land
		if (i < 0 || i >= rows || j < 0 || j >= columns || matrix[i][j] != 1) {
			return;
		}

		// Mark as visited by changing to '0'
		matrix[i][j] = 0;
		// Explore 4 directions
		dfs(matrix, i-1, j, rows, columns); //Up
		dfs(matrix, i+1, j, rows, columns); //Down
		dfs(matrix, i, j-1, rows, columns); //left
		dfs(matrix, i, j+1, rows, columns); //right
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
