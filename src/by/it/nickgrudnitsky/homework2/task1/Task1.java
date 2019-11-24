package by.it.nickgrudnitsky.homework2.task1;

import java.util.Random;

//Необходимо написать программу «Heads or Tails?» («Орёл или решка?»),
// которая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
// сколько раз выпал орёл, а сколько – решка.

public class Task1 {
    public static void main(String[] args) {
        printHeadsAndTails();
    }


    private static int flipACoin() {
        return new Random().nextInt(2);
    }

    private static int countHeads() {
        int heads = 0;
        for (int i = 0; i < 1000; i++) {
            int coin = flipACoin();
            if (coin == 1) {
                heads++;
            }
        }
        return heads;
    }

    private static void printHeadsAndTails() {
        int heads = countHeads();
        System.out.printf("You've got %d heads and %d tails.", heads, 1000 - heads);
    }
}
