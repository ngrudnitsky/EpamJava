package by.it.nickgrudnitsky.homework2.task2.task2_5;

import static by.it.nickgrudnitsky.homework2.util.DataInput.enterNaturalNumber;

public class Task2_5 {
    public static void main(String[] args) {
        printIntroduction();
        int numberOne = enterNaturalNumber();
        int numberTwo = enterNaturalNumber();
        System.out.printf("Greatest common divisor of numbers %d and %d is %d.", numberOne, numberTwo,
                findGreatestCommonDivisor(numberOne, numberTwo));

    }

    //Разработать наиболее эффективные алгоритмы и написать код для решения следующих задач:
    //- найти НОД и НОК двух натуральных чисел a и b.


    private static int findGreatestCommonDivisor(int numberOne, int numberTwo) {
        if (numberTwo == 0)
            return numberOne;
        return findGreatestCommonDivisor(numberTwo, numberOne % numberTwo);
    }

    private static void printIntroduction() {
        System.out.println("Enter two natural number.");

    }
}
