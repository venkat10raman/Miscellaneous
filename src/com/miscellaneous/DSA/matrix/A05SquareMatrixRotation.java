package com.miscellaneous.DSA.matrix;

public class A05SquareMatrixRotation {

	public enum Direction{
		CLOCKWISE, COUNTERCLOCKWISE
	}

	public static void main(String[] ...args) {
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("Matrix :");
		printMatrix(matrix);

		rotateMatrix(matrix, 90, Direction.CLOCKWISE);
	}

	private static void rotateMatrix(int[][] matrix, int angle, Direction direction) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			throw new IllegalArgumentException("Matrix cannot be null or empty");
		}
		if (angle%90 != 0) {
			throw new IllegalArgumentException("Angle must be multiples of 90");
		}
		if (direction == null) {
			throw new IllegalArgumentException("Direction cannot be null");
		}

		int rows = matrix.length;
		for(int[] row : matrix) {
			if(row.length != rows) {
				throw new IllegalArgumentException("Inconsistent row lengths in matrix");
			}
		}

		if(angle < 0) {
			if(direction == Direction.COUNTERCLOCKWISE) {
				direction = Direction.CLOCKWISE;
			} else {
				direction = Direction.COUNTERCLOCKWISE;
			}
		}
		angle = direction == Direction.COUNTERCLOCKWISE ? angle % 360 : angle; 

		// Normalize angle based on direction
		int effectiveAngle = direction == Direction.CLOCKWISE ? 
				Math.abs(angle % 360) : Math.abs((360 - angle) % 360);

		switch (effectiveAngle) {
		// 90° clockwise: transpose, then reverse each row
		case 90:
			transpose(matrix, rows);
			reverseRows(matrix, rows);
			break;
			// 180°: reverse both rows and columns
		case 180:
			reverseRows(matrix, rows);
			reverseColumns(matrix, rows);
			break;
			// 270° clockwise (90° counterclockwise): transpose, 
			// then reverse each column
		case 270: 
			transpose(matrix, rows);
			reverseColumns(matrix, rows);
			break;
			// No rotation
		case 0: 
			break;
		}

	}

	private static void reverseColumns(int[][] matrix, int rows) {
		for (int j = 0; j < rows; j++) {
            for (int i = 0; i < rows / 2; i++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows - 1 - i][j];
                matrix[rows - 1 - i][j] = temp;
            }
        }
	}

	private static void reverseRows(int[][] matrix, int rows) {
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][rows - 1 - j];
                matrix[i][rows - 1 - j] = temp;
            }
        }
	}

	private static void transpose(int[][] matrix, int rows) {
		for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
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
