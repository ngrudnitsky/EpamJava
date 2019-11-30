package by.it.nickgrudnitsky.practice;


import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        //double[] array = {-10.0, -10.0, -6.0, 7.0, 7.0, -8.0, -8.0, 10.0, 7.0, 7.0}; // хороший массив для проверки

        double[] array = generateArray(-10, 10);

        System.out.println(Arrays.toString(array));

        printMinimalIndex(findMinimalIndex(array));
        printSumm(findSumm(array));


    }

    //В одномерном массиве, состоящем из n вещественных элементов, вычислить
    //1)номер минимального элемента массива
    //2)и сумму элементов массива, расположенных между первым и вторым отрицательными элементами.

    private static int findMinimalIndex(double[] array) {
        double minimalElement = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (minimalElement > array[i]) {
                minimalElement = array[i];
                index = i;
            }
        }

        return index;
    }


    private static double findSumm(double[] array) {
        int index;
        int nextIndex;
        double summ = -1;

        index = findNextNegativeIndex(-1, array);
        nextIndex = findNextNegativeIndex(index, array);

        if (index == -1 || array[index + 1] < 0 || nextIndex == -1) { //возвращаем -1 если первый и второй отрицательные элементы идут один за другим
            return summ;                       // или если отрицательных элементов нет вообще или если нет второго отрицательного элемента
        }

        summ = 0;

        for (int i = index + 1; i < nextIndex; i++) {
            summ += array[i];
        }

        return summ;
    }

    private static int findNextNegativeIndex(int index, double[] array) { //возвращаем индекс следующего отрицательного элемента
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    private static double[] generateArray(int rangeFrom, int rangeTo) {
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (rangeTo - rangeFrom + 1)) + rangeFrom;
        }

        return array;
    }

    private static void printMinimalIndex(int index) {
        if (index >= 0) {
            System.out.printf("Minimal element's index is %d\n", index);
        } else {
            System.out.println("There are no negative elements in array.");
        }
    }

    private static void printSumm(double summ) {
        if (summ >= 0) {
            System.out.printf("Sum is %f.", summ);
        } else {
            System.out.println("There are no elements between first and second negative elements or there ara no negative elements at all.");
        }
    }

}
