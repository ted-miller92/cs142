/*
 * Theodore Miller
 * CS142 - Chris Denzler - Winter 2022
 * Assignment 7
 * This program initializes a matrix, prints it to standard output,
 * then prints the transpose of the matrix
 */

import java.util.*;

public class TransposeMatrix {

    public static void main(String[] args) {
        // initialize a new matrix and print to StdOut
        int[][] originalMatrix = InitializeMatrix(5, 5);
        System.out.println(Arrays.deepToString(originalMatrix));

        // transpose matrix and print to StdOut
        int[][] transposedMatrix = TransposingMatrix(originalMatrix);
        System.out.println(Arrays.deepToString(transposedMatrix));
    }

    // initialize matrix method
    public static int[][] InitializeMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * rows + j + 1;
            }
        }
        return matrix;
    }

    // transpose matrix method
    public static int[][] TransposingMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[rows][columns];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }
}
