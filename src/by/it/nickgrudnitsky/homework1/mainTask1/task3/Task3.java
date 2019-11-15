package by.it.nickgrudnitsky.homework1.mainTask1.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] radii = new double[2];

        System.out.println("Enter the outer and inner radius of the ring.");
        for (int i = 0; i < 2; i++) {
            try {
                radii[i] = scanner.nextFloat();
                if (radii[i] <= 0) {
                    System.out.println("Radius must be greater than zero.");
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input data, try again.");
                return;
            }
        }

        System.out.printf("The area of the ring equal %5.3f.", calcArea(radii[0], radii[1]));
    }

    private static double calcArea(double radius1, double radius2 ) {

        return Math.abs(Math.PI * (Math.pow(radius1, 2) - Math.pow(radius2, 2)));

    }
}
