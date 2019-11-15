package by.it.nickgrudnitsky.homework1.mainTask1.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float weight;
        System.out.println("Enter the weight of the dinosaur in kilograms.");
        try {
            weight = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input data, try again.");
            return;
        }
        if (weight <= 0) {
            System.out.println("Weight must be greater than zero.");
            return;
        }

        System.out.printf("The mass of a dinosaur equal %5.3f in tons, %5.3f in grams and %5.3f in milligrams",
                convertToTons(weight), convertGrams(weight), convertMilligrams(weight));
    }

    private static float convertToTons(float weight) {
        return weight / 1_000;
    }

    private static float convertGrams(float weight) {
        return weight * 1_000;
    }

    private static float convertMilligrams(float weight) {
        return weight * 1_000_000;
    }
}
