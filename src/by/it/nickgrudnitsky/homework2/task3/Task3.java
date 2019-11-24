package by.it.nickgrudnitsky.homework2.task3;

import static by.it.nickgrudnitsky.homework2.util.DataInput.enterNaturalNumber;
import static by.it.nickgrudnitsky.homework2.util.DataInput.printIntroduction;

public class Task3 {
    public static void main(String[] args) {
        printIntroduction();
        int naturalNumber = enterNaturalNumber();
        printResult(naturalNumber, findIfNumberIsPerfect(naturalNumber));
    }

    //Натуральное число называют совершенным, если оно равно сумме всех своих делителей,
    // не считая только его самого (например, 28=1+2+3+7+14 – совершенное число).
    // Напишите программу, которая проверяет, является ли введённое натуральное число совершенным.
    // Для проверки работоспособности программы приводится список некоторых совершенных чисел: 6, 28, 496, 8128.


    private static boolean findIfNumberIsPerfect(int number) {
        int summ = 1;
        int divider = 2;

        while (divider <= Math.sqrt(number)){
            if (number % divider == 0){
                summ = summ + divider + number/divider;

            }
            divider++;
        }

        return summ==number;
    }


    private static void printResult(int number, boolean flag) {
        if (flag) {
            System.out.printf("Number %d is perfect.", number);
        } else {
            System.out.printf("Number %d is not perfect.", number);
        }
    }
}
