package com.company.DSAPLACEMENTSHEET;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] matri = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};


        setZeroes(matri);


    }

    public static void setZeroes(int[][] matrix) {

        boolean col1 = false;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            if (matrix[i][0] == 0) {
                col1 = true;
            }

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }

            }

        }


        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }


            }
            if (col1) {
                matrix[i][0] = 0;
            }

        }

    }
}