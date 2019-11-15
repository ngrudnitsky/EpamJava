package by.it.nickgrudnitsky.homework1.mainTask1.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a four digit number.");

        try {
            number = Math.abs(scanner.nextInt());
            if (number / 1_000 == 0 || number / 1_000 >= 10) {
                System.out.println("Number must be four digit.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input data, try again.");
            return;
        }

        int result = increasedProgression(number);

        if (result == 1) {
            System.out.printf("Digits of number %d form an increased progression.", number);
        } else {
            if (result == -1) {
                System.out.printf("Digits of number %d form an decreased progression.", number);
            } else {
                System.out.printf("%d digits do not form any progression.", number);
            }
        }
    }

    private static int increasedProgression(int number) {

        int firstDigit = number / 1000;
        int secondDigit = (number - firstDigit * 1000) / 100;
        int thirdDigit = (number - firstDigit * 1000 - secondDigit * 100) / 10;
        int fourthDigit = (number - firstDigit * 1000 - secondDigit * 100 - thirdDigit * 10);

        if (firstDigit < secondDigit && secondDigit < thirdDigit && thirdDigit < fourthDigit) return 1;

        if (firstDigit > secondDigit && secondDigit > thirdDigit && thirdDigit > fourthDigit) return -1;

        return 0;
    }
}

