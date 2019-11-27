package by.it.nickgrudnitsky.homework2.task4;


import java.util.ArrayList;
import java.util.List;

import static by.it.nickgrudnitsky.homework2.util.DataInput.enterNaturalNumber;

public class Task4 {
    public static void main(String[] args) {
        printIntroduction();
        int numberOne = enterNaturalNumber();
        int numberTwo = enterNaturalNumber();
        printResult(numberOne, numberTwo, findIfNumberIsFriendly(numberOne, numberTwo));

    }

    //Дру́жественные чи́сла — два различных натуральных числа,
    // для которых сумма всех собственных делителей первого числа равна второму числу и наоборот,
    // сумма всех собственных делителей второго числа равна первому числу.
    // Дружественные числа были открыты последователями Пифагора,
    // которые, однако, знали только одну пару дружественных чисел – 220 и 284.
    // Найдите все дружественные числа в заданном диапазоне.

    //обходим все пары чисел из заданного диапазона
    private static List<Integer> findIfNumberIsFriendly(int firstNumber, int lastNumber) {
        List<Integer> friendlyNumbers = new ArrayList<>();
        for (int numberOne = firstNumber; numberOne < lastNumber + 1; numberOne++) {
            //для ускорения находим сумму делителей для второго числа сразу, что бы не пересчитывать по много раз
            int numberOneDividers = sumAllDividers(numberOne);
            for (int numberTwo = numberOne + 1; numberTwo < lastNumber + 1; numberTwo++) {
                //для ускорения проверяем на четность-нечетность
                //так как неизвестно, существует ли чётно-нечётная пара дружественных чисел вообще
                if (numberOne % 2 == numberTwo % 2) {
                    //для ускорения сперва сравниваем уже известную сумму со вторым числом
                    if (numberOneDividers == numberTwo && sumAllDividers(numberTwo) == numberOne) {
                        friendlyNumbers.add(numberOne);
                        friendlyNumbers.add(numberTwo);
                    }
                }
            }
        }
        return friendlyNumbers;
    }

    private static int sumAllDividers(int number) {
        int summ = 1;
        int divider = 2;
        while (divider <= Math.sqrt(number)) {
            if (number % divider == 0) {
                summ = summ + divider + number / divider;

            }
            divider++;
        }
        return summ;
    }

    private static void printResult(int numberOne, int numberTwo, List<Integer> friendlyNumbers) {
        if (friendlyNumbers.size() == 0) {
            System.out.printf("There is not friendly numbers betwen %d and %d.", numberOne, numberTwo);
            return;
        }
        System.out.println("Friendly numbers are:");
        for (int i = 0; i < friendlyNumbers.size() / 2; i+=2) {
            System.out.printf("%d and %d.\n", friendlyNumbers.get(i), friendlyNumbers.get(i + 1));
        }
    }

    private static void printIntroduction() {
        System.out.println("Enter two natural numbers.");
    }
}
