package by.it.nickgrudnitsky.homework1.mainTask1.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numbers = new float[3];
        System.out.println("Enter three numbers.");
        for (int i = 0; i < 3; i++) {
            try {
                numbers[i] = scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input data, try again.");
                return;
            }
        }

        float a = numbers[0];
        float b = numbers[1];
        float c = numbers[2];

        if (compareNumbers(a, b, c) == 1) {
            System.out.printf("Numbers %3.2f, %3.2f and %3.2f are equal.", a, b, c);
        } else {
            System.out.printf("Numbers %3.2f, %3.2f and %3.2f are not equal.", a, b, c);
        }
    }

    static private int compareNumbers(float a, float b, float c) {
        if (a == b && a == c) {
            return 1;
        } else {
            return -1;
        }
    }
}
