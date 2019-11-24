package by.it.nickgrudnitsky.homework2.task2.task2_6;

import java.util.HashSet;
import java.util.Set;

import static by.it.nickgrudnitsky.homework2.util.DataInput.enterNaturalNumber;
import static by.it.nickgrudnitsky.homework2.util.DataInput.printIntroduction;

public class Task2_6 {
    public static void main(String[] args) {
        printIntroduction();
        int naturalNumber = enterNaturalNumber();
        printSimpleDividers(naturalNumber, findNumberOfDifferentDigits(naturalNumber));

    }

    //Разработать наиболее эффективные алгоритмы и написать код для решения следующих задач:
    //- найти количество различных цифр у заданного натурального числа.

    private static int findNumberOfDifferentDigits(int number){
        Set<Integer> differentDigits = new HashSet<>();
        differentDigits.add(number % 10);
        if (number / 10 == 0) {
            return 1;
        }
        parseANumberRecursively(number / 10, differentDigits);
        return differentDigits.size();
    }

    private static void parseANumberRecursively(int number, Set<Integer> differentDigits){
        if (number / 10 == 0) {
            differentDigits.add(number);
            return;
        }
        differentDigits.add(number % 10);
        parseANumberRecursively(number / 10, differentDigits);
    }

    private static void printSimpleDividers(int number, int numberOfDigits) {
        System.out.printf("Number of different digits of number %d is %d.", number, numberOfDigits);
    }
}
