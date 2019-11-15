package by.it.nickgrudnitsky.homework1.mainTask1.task6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a seven digit number.");

        try {
            number = Math.abs(scanner.nextInt());
            if (number / 1_000_000 == 0 || number / 1_000_000 >= 10) {
                System.out.println("Number must be seven digit.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input data, try again.");
            return;
        }

        System.out.printf("Еhe inversion of %d is %d", number, reverse(number));
    }

    private static int reverse(int number) {
        return number / 1_000_000 + number % 1_000_000 / 100_000 * 10 + number % 100_000 / 10_000 * 100
                + number % 10_000 / 1_000 * 1_000 + number % 1_000 / 100 * 10_000
                + number % 100 / 10 * 100_000 + number % 10 * 1_000_000;
    }
}
