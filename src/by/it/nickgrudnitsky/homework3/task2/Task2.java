package by.it.nickgrudnitsky.homework3.task2;

import static by.it.nickgrudnitsky.homework3.util.MatrixGeneration.generateFloatMatrix;
import static by.it.nickgrudnitsky.homework3.util.MatrixGeneration.printMatrix;

public class Task2 {
    public static void main(String[] args) {
        double[][] matrix = generateFloatMatrix(3, 3, 1, 2);
        printMatrix(matrix);
        printResult(findArithmeticalMean(matrix), findGeometricMean(matrix));
    }

    //Задана матрица размера N x M. Необходимо выполнить следующие действия:
    //− найти среднеарифметическое и среднегеометрическое значения всех элементов матрицы;

    private static double findArithmeticalMean(double[][] matrix) {
        double elementSum = 0;
        for (double[] row : matrix) {
            for (double element : row) {
                elementSum += element;
            }
        }
        return elementSum / (matrix.length * matrix[0].length);
    }

    private static double findGeometricMean(double[][] matrix) {
        double elementComposition = 1;
        for (double[] row : matrix) {
            for (double element : row) {
                elementComposition *= element;
            }
        }
        return Math.pow(elementComposition, 1.0 / (matrix.length * matrix[0].length));
    }

    private static void printResult(double arithmeticalMean, double geometricMean) {
        System.out.printf("Arithmetical mean is %6.4f and geometric mean is %6.4f.", arithmeticalMean, geometricMean);
    }
}
