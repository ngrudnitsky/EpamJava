package by.it.nickgrudnitsky.homework2.task2.task2_3;

import static by.it.nickgrudnitsky.homework2.util.DataInput.enterNaturalNumber;
import static by.it.nickgrudnitsky.homework2.util.DataInput.printIntroduction;

public class Task2_3 {
    public static void main(String[] args) {
        printIntroduction();
        int naturalNumber = enterNaturalNumber();
        printIfTheNumberIsASimple(naturalNumber, checkIfNumberIsSimple(naturalNumber));

    }

    //Разработать наиболее эффективные алгоритмы и написать код для решения следующих задач:
    //- определить является ли заданное натуральное число простым;

    public static boolean checkIfNumberIsSimple(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }

        return parseANumberRecursively(number, 2);

    }

    private static boolean parseANumberRecursively(int number, int divider) {
        if (number % divider == 0) {
            return false;
        }

        if (divider <= Math.sqrt(number)) { // проверяем делители только до квадратного корня из числа
            return parseANumberRecursively(number, ++divider);
        } else {
            return true;
        }
    }

    private static void printIfTheNumberIsASimple(int number, boolean flag) {
        if (flag) {
            System.out.printf("Number %d is simple.", number);
        } else {
            System.out.printf("Number %d is not simple.", number);
        }
    }
}
