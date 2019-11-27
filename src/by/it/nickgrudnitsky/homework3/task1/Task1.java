package by.it.nickgrudnitsky.homework3.task1;

import java.util.Arrays;

import static by.it.nickgrudnitsky.homework3.util.MatrixGeneration.generateFloatMatrix;
import static by.it.nickgrudnitsky.homework3.util.MatrixGeneration.printMatrix;

public class Task1 {
    public static void main(String[] args) {
        double[][] matrix = generateFloatMatrix(4, 4, -10, 10);
        printMatrix(matrix);
        printResult(findMaximumElement(matrix), findMinimumElement(matrix));
    }

    //Задана матрица размера N x M. Необходимо выполнить следующие действия:
    //− найти экстремальные значения (минимальный и максимальный элементы) данной матрицы;


    private static double findMinimumElement(double[][] matrix) {
        for (double[] row : matrix) { //сперва сортируем для ускорения
            Arrays.sort(row);
        }
        double minElement = matrix[0][0]; //сразу выписываем первый минимум, что бы начать сравнение сраззу со второго
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] < minElement) {
                minElement = matrix[i][0];
            }
        }
        return minElement;
    }

    private static double findMaximumElement(double[][] matrix) {
        for (double[] row : matrix) { //сперва сортируем для ускорения
            Arrays.sort(row);
        }
        double maxElement = matrix[0][matrix[0].length - 1]; //сразу выписываем первый минимум, что бы начать сравнение сраззу со второго
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][matrix[0].length - 1] > maxElement) {
                maxElement = matrix[i][matrix[0].length - 1];
            }
        }
        return maxElement;
    }


    private static void printResult(double maxElement, double minElement) {
        System.out.printf("Extrem elements are %5.2f and %5.2f.", minElement, maxElement);
    }
}
