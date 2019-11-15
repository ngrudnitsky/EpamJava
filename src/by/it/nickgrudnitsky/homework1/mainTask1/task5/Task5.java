package by.it.nickgrudnitsky.homework1.mainTask1.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a six digit number.");

        try {
            number = Math.abs(scanner.nextInt());
            if (number / 100_000 == 0 || number / 100_000 >= 10) {
                System.out.println("Number must be six digit.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input data, try again.");
            return;
        }

        System.out.printf("Arithmetic mean of %d is %5.3f and geometric mean is %5.3f", number, arithmeticMean(number), geometricMean(number));
    }


    private static float arithmeticMean(int number) {
        float sumOfDigits = number / 100_000 + number % 100_000 / 10_000 + number % 10_000 / 1_000 + number % 1_000 / 100
                + number % 100 / 10 + number % 10;

        return sumOfDigits / 6;
    }

    private static double geometricMean(int number) {
        float mulOfDigits = (number / 100_000) * (number % 100_000 / 10_000) * (number % 10_000 / 1_000) * (number % 1_000 / 100)
                * (number % 100 / 10) * (number % 10);

        return Math.pow(mulOfDigits, 1.0 / 6);
    }
}
