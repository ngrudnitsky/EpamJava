package by.it.nickgrudnitsky.homework1.mainTask2.task1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Dot> dots = new ArrayList<>();
        System.out.println("Enter the coordinates of three points with a space.");
        for (int i = 0; i < 3; i++) {
            try {
                dots.add(new Dot(scanner.nextFloat(), scanner.nextFloat()));
            } catch (InputMismatchException e) {
                System.out.println("Invalid input data, try again.");
                return;
            }
        }

        if (isTriangle(dots) == 1) {
            if (isRightTriangle(dots) == 1) {
                System.out.println("It is a right triangle.");
            } else {
                System.out.println("It is a triangle.");
            }
        } else {
            System.out.println("It is not triangle.");
        }
    }

    private static int isRightTriangle(ArrayList<Dot> dots) {
        float x1 = dots.get(0).getX();
        float x2 = dots.get(1).getX();
        float x3 = dots.get(2).getX();
        float y1 = dots.get(0).getY();
        float y2 = dots.get(1).getY();
        float y3 = dots.get(2).getY();

        double ab = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        double bc = Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2);
        double ca = Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2);

        if (ab + bc == ca || bc + ca == ab || ca + ab == bc) return 1;

        return 0;
    }

    private static int isTriangle(ArrayList<Dot> dots) {
        Dot dot1 = dots.get(0);
        Dot dot2 = dots.get(1);
        Dot dot3 = dots.get(2);

        if ((dot1.getX() == dot2.getX() && dot1.getY() == dot2.getY()) ||
                (dot1.getX() == dot3.getX() && dot1.getY() == dot3.getY())) return 0;
        return 1;
    }

}
