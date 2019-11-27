package by.it.nickgrudnitsky.homework3.util;


import java.util.Arrays;

public class MatrixGeneration {
    public static double[][] generateFloatMatrix(int n, int m, int rangeFrom, int rangeTo) {
        double[][] matrix = new double[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * (rangeTo - rangeFrom + 1)) + rangeFrom;
            }
        }
        return matrix;
    }

    public static void printMatrix(double[][] matrix) {
        System.out.println("Matrix:");

        for (double[] doubles : matrix) {
            System.out.println(Arrays.toString(doubles));
        }
    }

}
