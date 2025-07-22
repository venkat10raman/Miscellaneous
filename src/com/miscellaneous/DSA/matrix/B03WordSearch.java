package com.miscellaneous.DSA.matrix;

public class B03WordSearch {

	public enum Direction{
		UP, DOWN, LEFT, RIGHT, UPRIGHT, UPLEFT, DOWNLEFT, DOWNRIGHT
	}

	public static void main(String[] args) {
		char[][] board = {
				{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'},
				{'A', 'D', 'E', 'E'}
		};
		String[] words = {"AFE", "CCE", "AFC", "ABC", "ECB", "DFB", "ECD", "EFA"};

		for(String word : words) {
			System.out.println("Board:");
			printBoard(board);
			System.out.println();
			System.out.println(word);
			searchWord(board,word);
		}

	}

	private static void searchWord(char[][] board, String word) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return;
		}
		if (word == null || word.length() == 0) {
			// Empty word is considered found
			return;
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
				if(board[i][j] == word.charAt(0)) {
					int[][] indexArray = new int[word.length()][2];
					if(dfs(board, word, i, j, 0, rows, columns, Direction.RIGHT, indexArray)) {
						printMatrix(indexArray);
						indexArray = new int[word.length()][2];
					}
					if(dfs(board, word, i, j, 0, rows, columns, Direction.LEFT, indexArray)) {
						printMatrix(indexArray);
						indexArray = new int[word.length()][2];
					}
					
					if(dfs(board, word, i, j, 0, rows, columns, Direction.UP, indexArray)) {
						printMatrix(indexArray);
						indexArray = new int[word.length()][2];
					}
					
					if(dfs(board, word, i, j, 0, rows, columns, Direction.DOWN, indexArray)) {
						printMatrix(indexArray);
						indexArray = new int[word.length()][2];
					}
					
					if(dfs(board, word, i, j, 0, rows, columns, Direction.UPRIGHT, indexArray)) {
						printMatrix(indexArray);
						indexArray = new int[word.length()][2];
					}
					
					if(dfs(board, word, i, j, 0, rows, columns, Direction.UPLEFT, indexArray)) {
						printMatrix(indexArray);
						indexArray = new int[word.length()][2];
					}
					
					if(dfs(board, word, i, j, 0, rows, columns, Direction.DOWNRIGHT, indexArray)) {
						printMatrix(indexArray);
						indexArray = new int[word.length()][2];
					}
					
					if(dfs(board, word, i, j, 0, rows, columns, Direction.DOWNLEFT, indexArray)) {
						printMatrix(indexArray);
						indexArray = new int[word.length()][2];
					}
				}
			}
		}
		return ;
	}

	private static boolean dfs(char[][] board, String word, int i, int j, int index, int rows, int columns, Direction dir, int[][] indexArray) {
		if(index == word.length()) {
			return true;
		}

		if(i<0 || i>=rows || j<0 || j>=columns || board[i][j] != word.charAt(index)) {
			return false;
		}

		indexArray[index][0] = i;
		indexArray[index][1] = j;
		boolean found = false;

		switch (dir) {
		case UP: {
			found = dfs(board, word, i-1, j, index+1, rows, columns, dir, indexArray);
			break;
		} case DOWN: {
			found = dfs(board, word, i+1, j, index+1, rows, columns, dir, indexArray);
			break;
		} case LEFT : {
			found = dfs(board, word, i, j-1, index+1, rows, columns, dir, indexArray);
			break;
		} case UPRIGHT: {
			found = dfs(board, word, i-1, j+1, index+1, rows, columns, dir, indexArray);
			break;
		} case UPLEFT: {
			found = dfs(board, word, i-1, j-1, index+1, rows, columns, dir, indexArray);
			break;
		} case DOWNLEFT: {
			found = dfs(board, word, i+1, j-1, index+1, rows, columns, dir, indexArray);
			break;
		} case DOWNRIGHT: {
			found = dfs(board, word, i+1, j+1, index+1, rows, columns, dir, indexArray);
			break;
		}
		default:
			found = dfs(board, word, i, j+1, index+1, rows, columns, dir, indexArray);
			break;
		}

		return found;
	}

	private static void printBoard(char[][] board) {
		for (char[] row : board) {
			for (char val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	private static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for(int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------");
	}

}
