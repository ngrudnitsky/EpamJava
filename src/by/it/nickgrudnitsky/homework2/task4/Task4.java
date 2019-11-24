package by.it.nickgrudnitsky.homework2.task4;

import static by.it.nickgrudnitsky.homework2.util.DataInput.enterNaturalNumber;
import static by.it.nickgrudnitsky.homework2.util.DataInput.printIntroduction;

public class Task4 {
    public static void main(String[] args) {
        printIntroduction();
        /*int numberOne = enterNaturalNumber();
        int numberTwo = enterNaturalNumber();*/
        System.out.println(findIfNumberIsFriendly(220, 284));
    }

    //Дру́жественные чи́сла — два различных натуральных числа,
    // для которых сумма всех собственных делителей первого числа равна второму числу и наоборот,
    // сумма всех собственных делителей второго числа равна первому числу.
    // Дружественные числа были открыты последователями Пифагора,
    // которые, однако, знали только одну пару дружественных чисел – 220 и 284.
    // Найдите все дружественные числа в заданном диапазоне.

    private static boolean findIfNumberIsFriendly(int numberOne, int numberTwo){
        return sumAllDividers(numberTwo)==sumAllDividers(numberOne);

    }

    private static int sumAllDividers(int number){
        int summ = 1;
        int divider = 2;
        while (divider <= Math.sqrt(number)){
            if (number % divider == 0){
                summ = summ + divider + number/divider;

            }
            divider++;
        }

        return summ;
    }

}
