package com.miscellaneous.DSA.matrix;

import java.util.ArrayList;
import java.util.List;

public class A06MatrixSpiralPrint {

	public static void main(String[] args) {
		int[][] matrix = {
				{10, 11, 12, 13, 14},
				{15, 16, 17, 18, 19},
				{20, 21, 22, 23, 24}
		};
		
		System.out.println("Matrix:");
		printMatrix(matrix);
		
		spiralPrint(matrix);
	}
	
	private static void spiralPrint(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			throw new IllegalArgumentException("Matrix cannot be null or empty");
        }
		
		int rows = matrix.length;
        int columns = matrix[0].length;
        for (int[] row : matrix) {
            if (row.length != columns) {
                throw new IllegalArgumentException("Inconsistent row lengths in matrix");
            }
        }
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;
        int totalElements = rows * columns;
        int count = 0;
        
        
        while(top <= bottom && left <= right && count < totalElements) {
        	// Traverse top row (left to right)
        	for(int i=top; i<=right && count < totalElements; i++) {
        		result.add(matrix[top][i]);
        		count++;
        	}
        	top++;
        	
        	// Traverse right column (top to bottom)
        	for(int i=top; i<=bottom && count < totalElements; i++) {
        		result.add(matrix[i][right]);
        		count++;
        	}
        	right--;
        	
        	if (top <= bottom) {
                // Traverse bottom row (right to left)
                for (int i=right; i>=left && count < totalElements; i--) {
                    result.add(matrix[bottom][i]);
                    count++;
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse left column (bottom to top)
                for (int i=bottom; i>=top && count < totalElements; i--) {
                    result.add(matrix[i][left]);
                    count++;
                }
                left++;
            }
        }
        
        System.out.println("\nSpiral Order:");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println("\n-----------");
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
