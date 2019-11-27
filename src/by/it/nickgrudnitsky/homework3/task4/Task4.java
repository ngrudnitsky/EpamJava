package by.it.nickgrudnitsky.homework3.task4;

import static by.it.nickgrudnitsky.homework3.util.MatrixGeneration.generateFloatMatrix;
import static by.it.nickgrudnitsky.homework3.util.MatrixGeneration.printMatrix;

public class Task4 {
    public static void main(String[] args) {
        double[][] matrix = generateFloatMatrix(3, 4, -10, 10);
        printMatrix(matrix);
        printMatrix(transposeMatrix(matrix));
    }

    //Задана матрица размера N x M. Необходимо выполнить следующие действия:
    //− транспонировать матрицу (при решении данного задания не рекомендуется задействовать дополнительную память).

    private static double[][] transposeMatrix(double[][] matrix) {
        double[][] transposedMatrix = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }


}
