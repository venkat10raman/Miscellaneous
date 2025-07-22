package com.miscellaneous.DSA.matrix;

public class B02WordSearch {

	public static void main(String[] args) {
		char[][] board = {
				{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'},
				{'A', 'D', 'E', 'E'}
		};
		String[] words = {"ABCCED", "SEE", "ABCB"};
		System.out.println("Board:");
		printBoard(board);
		System.out.println();

		for (String word : words) {
			boolean exists = exist(board, word);
			System.out.println("Word \"" + word + "\" exists: " + exists);
		}
	}

	private static boolean exist(char[][] board, String word) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return false;
		}
		if (word == null || word.length() == 0) {
			// Empty word is considered found
			return true;
		}

		int rows = board.length;
		int columns = board[0].length;
		for(char[] row : board) {
			if(row.length != columns) {
				throw new IllegalArgumentException("Inconsistent row lengths in board");
			}
		}

		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				if(board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0, rows, columns)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfs(char[][] board, String word, int i, int j, int index, int rows, int columns) {
		if(index == word.length()) {
			return true;
		}

		if(i<0 || i>=rows || j<0 || j>=columns || board[i][j] != word.charAt(index)) {
			return false;
		}

		// Save current cell value and mark as visited
		char temp = board[i][j];
		board[i][j] = '#'; // Use '#' to mark visited

		// Explore 4 directions: up, down, left, right
		boolean found = dfs(board, word, i - 1, j, index + 1, rows, columns) || // Up
				dfs(board, word, i + 1, j, index + 1, rows, columns) || // Down
				dfs(board, word, i, j - 1, index + 1, rows, columns) || // Left
				dfs(board, word, i, j + 1, index + 1, rows, columns);  // Right

		// Restore cell value (backtrack)
		board[i][j] = temp;
		return found;
	}

	public static void printBoard(char[][] board) {
		for (char[] row : board) {
			for (char val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
