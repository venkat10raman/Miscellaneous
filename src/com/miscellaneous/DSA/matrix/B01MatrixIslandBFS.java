package com.miscellaneous.DSA.matrix;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class B01MatrixIslandBFS {

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
			if (row.length != columns) {
				throw new IllegalArgumentException("Inconsistent row lengths in grid");
			}
		}
		int islands = 0;
		Set<String> visited = new HashSet<>();
		Queue<int[]> queue = new LinkedList<>();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				if(matrix[i][j] == 1 && !visited.contains(i+":"+j)) {
					islands++;
					bfs(matrix, i, j, rows, columns, visited, queue);
				}
				
			}
		}
		return islands;
	}

	private static void bfs(int[][] matrix, int row, int column, 
			int rows, int columns, Set<String> visited,
			Queue<int[]> queue) {
		// start BFS from (row, column)
		queue.offer(new int[] {row, column});
		visited.add(row + ":" + column);

		// Directions: up, down, left, right
		int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

		while(!queue.isEmpty()) {
			int[] cell = queue.poll();
			int i = cell[0], j = cell[1];

			// Explore 4 directions
			for(int[] dir : directions) {
				int newI = i + dir[0];
				int newJ = j + dir[1];
				String key = newI + ":" + newJ;
				if(newI >= 0 && newI < rows && newJ >= 0 && newJ < columns
						&& matrix[newI][newJ] == 1 && !visited.contains(key)) {
					queue.offer(new int[] {newI, newJ});
					visited.add(key);
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
