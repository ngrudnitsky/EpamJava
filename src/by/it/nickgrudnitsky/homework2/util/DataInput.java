package by.it.nickgrudnitsky.homework2.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataInput {

    public static int enterNaturalNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input data, try again.");
            return enterNaturalNumber();
        }
        if (number <= 0) {
            System.out.println("Number must be natural.");
            return enterNaturalNumber();
        }
        return number;
    }

    public static void printIntroduction() {
        System.out.println("Enter natural number.");
    }
}
