package by.it.nickgrudnitsky.homework2.task2.task2_1;

import static by.it.nickgrudnitsky.homework2.util.DataInput.enterNaturalNumber;
import static by.it.nickgrudnitsky.homework2.util.DataInput.printIntroduction;

public class Task2_1 {
    public static void main(String[] args) {
        printIntroduction();
        int naturalNumber = enterNaturalNumber();
        printLargestDigit(findMaxDigit(naturalNumber), naturalNumber);

    }

    //Разработать наиболее эффективные алгоритмы и написать код для решения следующих задач:
    // - найти наибольшую цифру натурального числа;

    private static int findMaxDigit(int number) {
        int firstDigit = number % 10;
        int remainderOfNumber = number / 10;
        int anotherDigit = 0;

        if (remainderOfNumber != 0) {
            anotherDigit = findMaxDigit(remainderOfNumber);
        }

        if (anotherDigit == 9 || firstDigit == 9) {
            return 9;
        } else if (firstDigit > anotherDigit) {
            return firstDigit;
        }

        return anotherDigit;
    }

    private static void printLargestDigit(int digit, int number) {
        System.out.printf("The largest digit of a natural number %d is %d", number, digit);
    }

}
