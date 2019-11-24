package by.it.nickgrudnitsky.homework2.task2.task2_2;

import java.util.LinkedList;

import static by.it.nickgrudnitsky.homework2.util.DataInput.enterNaturalNumber;
import static by.it.nickgrudnitsky.homework2.util.DataInput.printIntroduction;

public class Task2_2 {
    public static void main(String[] args) {
        printIntroduction();
        int naturalNumber = enterNaturalNumber();
        printIfTheNumberIsAPalindrome(naturalNumber, checkIfTheNumberIsAPalindrome(naturalNumber));
    }

    //Разработать наиболее эффективные алгоритмы и написать код для решения следующих задач:
    //- проверить, является ли заданное натуральное число палиндромом;

    private static boolean checkIfTheNumberIsAPalindrome(int number) {
        LinkedList<Integer> digits = new LinkedList<>();

        parseANumberRecursively(number, digits);
        for (int i = 0; i < digits.size(); i++) {
            if (digits.getFirst().equals(digits.getLast())) {
                digits.removeFirst();
                if (digits.size() != 0) {
                    digits.removeLast();
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private static void parseANumberRecursively(int number, LinkedList<Integer> digits) {
        digits.addFirst(number % 10);
        if (number / 10 != 0) {
            parseANumberRecursively(number / 10, digits);
        }
    }

    private static void printIfTheNumberIsAPalindrome(int number, boolean flag) {
        if (flag) {
            System.out.printf("Number %d is a palindrome.", number);
        } else {
            System.out.printf("Number %d is not a palindrome.", number);
        }
    }
}
