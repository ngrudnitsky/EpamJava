package by.it.nickgrudnitsky.homework1.mainTask1.task7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];
        System.out.println("Enter two integers.");
        for (int i = 0; i < 2; i++) {
            try {
                numbers[i] = Math.abs(scanner.nextInt());

            } catch (InputMismatchException e) {
                System.out.println("Invalid input data, try again.");
                return;
            }
        }

        swap(numbers);

        System.out.println("Numbers were swapped: " + numbers[0] + " " + numbers[1] + ".");
    }

    private static void swap(int[] numbers) {
        int a = numbers[0];
        int b = numbers[1];

        a = a + b - (b = a);

        numbers[0] = a;
        numbers[1] = b;

    }
}
