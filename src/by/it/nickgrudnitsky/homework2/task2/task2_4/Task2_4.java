package by.it.nickgrudnitsky.homework2.task2.task2_4;

import java.util.ArrayList;
import java.util.List;

import static by.it.nickgrudnitsky.homework2.task2.task2_3.Task2_3.checkIfNumberIsSimple;
import static by.it.nickgrudnitsky.homework2.util.DataInput.enterNaturalNumber;
import static by.it.nickgrudnitsky.homework2.util.DataInput.printIntroduction;

public class Task2_4 {
    public static void main(String[] args) {
        printIntroduction();
        int naturalNumber = enterNaturalNumber();
        printSimpleDividers(naturalNumber, findAllSimpleDividers(naturalNumber));

    }

    //Разработать наиболее эффективные алгоритмы и написать код для решения следующих задач:
    //- найти все простые делители заданного натурального числа;

    private static List<Integer> findAllSimpleDividers(int number) {
        List<Integer> simpleDividers = new ArrayList<>();

        if (number % 2 == 0) { //проверяем первый простой делитель
            simpleDividers.add(2);
        }
        parseANumberRecursively(number, 2, simpleDividers);    //рекурсинвно проверям все остальные
                                                                            // простые делители
        return simpleDividers;
    }

    private static void parseANumberRecursively(int number, int simpleNumber, List<Integer> simpleDividers) {
        simpleNumber = nextSimpleNumber(simpleNumber); //получаем следующий простой делитель
        if (number % simpleNumber == 0) {
            simpleDividers.add(simpleNumber);
        }
        if (simpleNumber > number) {
            return;
        }
        parseANumberRecursively(number, simpleNumber, simpleDividers);
    }

    //рекурсиновно ищем следующий простой делитель, используя метод, который написали в предыдущем задании
    private static int nextSimpleNumber(int simpleNumber) {
        if (checkIfNumberIsSimple(++simpleNumber)) {
            return simpleNumber;
        } else {
            return nextSimpleNumber(simpleNumber);
        }
    }

    private static void printSimpleDividers(int number, List<Integer> simpleDividers) {
        System.out.printf("Simple dividers of the number %d: " + simpleDividers + ".", number);
    }
}
