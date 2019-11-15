package by.it.nickgrudnitsky.homework1.mainTask2.task2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Enter the number of years of the dragon.");

        try {
            if ((age = scanner.nextInt()) <= 0) {
                System.out.println("Age must be positive.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input data, try again.");
            return;
        }

        System.out.printf("The dragon has %d heads and %d eyes", countHeads(age), countHeads(age)*2);
    }

    private static int countHeads(int age) {
        if (age - 200 <= 0) {
            return age * 3 + 3;
        } else {
            if (age - 300 <= 0) {
                return (age - 200) * 2 + 200 * 3 + 3;
            }
        }
        return (age - 300 * 1) + 200 * 3 + 100 * 3 + 3;
    }
}
