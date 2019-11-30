package by.it.nickgrudnitsky.homework3.task3;

import static by.it.nickgrudnitsky.homework3.util.MatrixGeneration.generateFloatMatrix;
import static by.it.nickgrudnitsky.homework3.util.MatrixGeneration.printMatrix;

public class Task3 {
    public static void main(String[] args) {
        double[][] matrix = generateFloatMatrix(4, 4, -10, 10);
        printMatrix(matrix);
        printLocalMinimumAndMaximum(findLocalMinimum(matrix), findLocalMaximum(matrix));
    }

    //Задана матрица размера N x M. Необходимо выполнить следующие действия:
    //− найти позицию первого встретившегося локального минимума (максимума),
    //а если таких элементов нет, то возвратить -1 (локальный минимум – это элемент,
    //который меньше любого из своих соседей; локальный максимум – это элемент,
    //который больше любого из своих соседей);



    private static double findLocalMinimum(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                //проверка элемента вверху слева
                if (i == 0 && j == 0) {
                    if (matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i + 1][j + 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента вверху (не в углу)
                if (i == 0 && j != matrix[0].length - 1) {
                    if (matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i + 1][j + 1]
                            && matrix[i][j] < matrix[i + 1][j - 1] && matrix[i][j] < matrix[i][j - 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }


                //проверка элемента внизу слева
                if (i == matrix.length - 1 && j == 0) {
                    if (matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i - 1][j + 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента внизу (не в углу)
                if (i == matrix.length - 1 && j != matrix[0].length - 1) {
                    if (matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i - 1][j + 1] && matrix[i][j] < matrix[i - 1][j]
                            && matrix[i][j] < matrix[i - 1][j - 1] && matrix[i][j] < matrix[i][j - 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента вверху справа
                if (i == 0 && j == matrix[0].length - 1) {
                    if (matrix[i][j] < matrix[i][j - 1] && matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i + 1][j - 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента справа (не в углу)
                if (j == matrix[0].length - 1 && i != matrix.length - 1) {
                    if (matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i + 1][j - 1] && matrix[i][j] < matrix[i][j - 1]
                            && matrix[i][j] < matrix[i + 1][j - 1] && matrix[i][j] < matrix[i + 1][j]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента внизу справа
                if (i == matrix.length - 1 && j == matrix[0].length - 1) {
                    if (matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i][j - 1] && matrix[i][j] < matrix[i - 1][j - 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента слева (не в углу)
                if (j == 0 && i != matrix.length - 1) {
                    if (matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i + 1][j + 1] && matrix[i][j] < matrix[i][j + 1]
                            && matrix[i][j] < matrix[i - 1][j + 1] && matrix[i][j] < matrix[i - 1][j]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка общего случая
                if (matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i - 1][j + 1] && matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i - 1][j + 1] &&
                        matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i - 1][j - 1] && matrix[i][j] < matrix[i][j - 1] && matrix[i][j] < matrix[i + 1][j - 1]) {
                    return matrix[i][j];
                }


            }
        }
        return -1;
    }

    private static double findLocalMaximum(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                //проверка элемента вверху слева
                if (i == 0 && j == 0) {
                    if (matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i + 1][j + 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента вверху (не в углу)
                if (i == 0 && j != matrix[0].length - 1) {
                    if (matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i + 1][j + 1]
                            && matrix[i][j] > matrix[i + 1][j - 1] && matrix[i][j] > matrix[i][j - 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента внизу слева
                if (i == matrix.length - 1 && j == 0) {
                    if (matrix[i][j] > matrix[i - 1][j] && matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i - 1][j + 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента внизу (не в углу)
                if (i == matrix.length - 1 && j != matrix[0].length - 1) {
                    if (matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i - 1][j + 1] && matrix[i][j] > matrix[i - 1][j]
                            && matrix[i][j] > matrix[i - 1][j - 1] && matrix[i][j] > matrix[i][j - 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента вверху справа
                if (i == 0 && j == matrix[0].length - 1) {
                    if (matrix[i][j] > matrix[i][j - 1] && matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i + 1][j - 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента справа (не в углу)
                if (j == matrix[0].length - 1 && i != matrix.length - 1) {
                    if (matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i + 1][j - 1] && matrix[i][j] > matrix[i][j - 1]
                            && matrix[i][j] > matrix[i + 1][j - 1] && matrix[i][j] > matrix[i + 1][j]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента внизу справа
                if (i == matrix.length - 1 && j == matrix[0].length - 1) {
                    if (matrix[i][j] > matrix[i - 1][j] && matrix[i][j] > matrix[i][j - 1] && matrix[i][j] > matrix[i - 1][j - 1]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка элемента слева (не в углу)
                if (j == 0 && i != matrix.length - 1) {
                    if (matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i + 1][j + 1] && matrix[i][j] > matrix[i][j + 1]
                            && matrix[i][j] > matrix[i - 1][j + 1] && matrix[i][j] > matrix[i - 1][j]) {
                        return matrix[i][j];
                    }
                    continue;
                }

                //проверка общего случая
                if (matrix[i][j] > matrix[i - 1][j] && matrix[i][j] > matrix[i - 1][j + 1] && matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i - 1][j + 1] &&
                        matrix[i][j] > matrix[i - 1][j] && matrix[i][j] > matrix[i - 1][j - 1] && matrix[i][j] > matrix[i][j - 1] && matrix[i][j] > matrix[i + 1][j - 1]) {
                    return matrix[i][j];
                }


            }
        }
        return -1;
    }

    private static void printLocalMinimumAndMaximum(double localMinimum, double localMaximum) {
        if (localMaximum == -1 && localMinimum == -1) {
            System.out.println("There is no local minimum and local maximum.");
            return;
        }
        if (localMaximum == -1) {
            System.out.printf("First local minimum is %3.1f and there is not local maximum.\n", localMinimum);
            return;
        }
        if (localMinimum == -1) {
            System.out.printf("First local maximum is %3.1f and there is not local minimum.\n", localMaximum);
            return;
        }
        System.out.printf("First local minimum is %3.1f and first local maximum is %3.1f\n", localMinimum, localMaximum);
    }
}
