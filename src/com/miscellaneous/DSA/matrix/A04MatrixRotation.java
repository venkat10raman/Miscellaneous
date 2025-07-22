package com.miscellaneous.DSA.matrix;

import java.util.stream.IntStream;

public class A04MatrixRotation {

	public enum Direction {
		CLOCKWISE, COUNTERCLOCKWISE
	}

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8}};

		System.out.println("Original Matrix:");
		printMatrix(matrix);
		
		System.out.println("\nRotated 90° Clockwise:");
		rotateMatrix(matrix, 90, Direction.CLOCKWISE);
		
		System.out.println("\nRotated 180° Clockwise:");
		rotateMatrix(matrix, 180, Direction.CLOCKWISE);
		
		System.out.println("\nRotated 270° Clockwise:");
		rotateMatrix(matrix, 270, Direction.CLOCKWISE);
		
		System.out.println("\nRotated 360° Clockwise:");
		rotateMatrix(matrix, 360, Direction.CLOCKWISE);
		
		System.out.println("\nRotated 450° Clockwise:");
		rotateMatrix(matrix, 450, Direction.CLOCKWISE);
		
		System.out.println("Original Matrix:");
		printMatrix(matrix);
		
		System.out.println("\nRotated 90° Counter Clockwise:");
		rotateMatrix(matrix, 90, Direction.COUNTERCLOCKWISE);
		
		System.out.println("\nRotated 180° Counter Clockwise:");
		rotateMatrix(matrix, 180, Direction.COUNTERCLOCKWISE);
		
		System.out.println("\nRotated 270° Counter Clockwise:");
		rotateMatrix(matrix, 270, Direction.COUNTERCLOCKWISE);
		
		System.out.println("\nRotated 360° Counter Clockwise:");
		rotateMatrix(matrix, 360, Direction.COUNTERCLOCKWISE);
		
		System.out.println("\nRotated 450° Counter Clockwise:");
		rotateMatrix(matrix, 450, Direction.COUNTERCLOCKWISE);
	}

	private static void rotateMatrix(int[][] matrix, int angle, Direction direction) {
		// Validate input
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
		int columns = matrix[0].length;

		for(int[] row : matrix) {
			if(row.length != columns) {
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
		
		
		// Determine result dimensions
		int newRows = (effectiveAngle%180 == 0) ? rows : columns;
        int newCols = (effectiveAngle%180 == 0) ? columns : rows;
        int[][] result = new int[newRows][newCols];
        
        for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < columns; j++) {
        		switch (effectiveAngle) {
				case 90: {
					result[j][rows - 1 - i] = matrix[i][j];
                    break;
				}
				case 180: {
					result[rows - 1 - i][columns - 1 - j] = matrix[i][j];
                    break;
				}
				case 270: {
					result[columns - 1 - j][i] = matrix[i][j];
                    break;
				}
				default:
					result[i][j] = matrix[i][j];
					break;
				}
        	}
        }
        printMatrix(result);
        
        int[][] sr = new int[newRows][newCols];
        IntStream.range(0, rows).forEach(i -> {
        	IntStream.range(0, columns).forEach(j -> {
        		switch (effectiveAngle) {
				case 90: {
					sr[j][rows - 1 - i] = matrix[i][j];
                    break;
				}
				case 180: {
					sr[rows - 1 - i][columns - 1 - j] = matrix[i][j];
                    break;
				}
				case 270: {
					sr[columns - 1 - j][i] = matrix[i][j];
                    break;
				}
				default:
					sr[i][j] = matrix[i][j];
					break;
				}
        	});
        });
        printMatrix(sr);
	}

	private static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for(int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

}
