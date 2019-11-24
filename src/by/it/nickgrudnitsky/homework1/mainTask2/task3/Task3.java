package by.it.nickgrudnitsky.homework1.mainTask2.task3;

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol;
        System.out.println("Enter vowel.");

        symbol = scanner.next();

        if (isVowel1(symbol)) System.out.println("This is a vowel. (Method 1)");
        else System.out.println("This is not a vowel. (Method 1)");

        if (isVowel2(symbol)) System.out.println("This is a vowel. (Method 2)");
        else System.out.println("This is not a vowel. (Method 2)");

        if (isVowel3(symbol)) System.out.println("This is a vowel. (Method 3)");
        else System.out.println("This is not a vowel. (Method 3)");

        if (isVowel4(symbol)) System.out.println("This is a vowel. (Method 4)");
        else System.out.println("This is not a vowel. (Method 4)");
    }

    private static boolean isVowel1(String symbol) {
        return symbol.matches("[aeuioAEUIO]");
    }

    private static boolean isVowel2(String symbol) {
        if (symbol.equals("e")) return true;
        if (symbol.equals("u")) return true;
        if (symbol.equals("o")) return true;
        if (symbol.equals("i")) return true;
        if (symbol.equals("A")) return true;
        if (symbol.equals("E")) return true;
        if (symbol.equals("U")) return true;
        if (symbol.equals("I")) return true;
        if (symbol.equals("O")) return true;
        return symbol.equals("a");
    }

    private static boolean isVowel3(String symbol) {
        switch (symbol) {
            case "e":
            case "u":
            case "o":
            case "a":
            case "O":
            case "i":
            case "A":
            case "E":
            case "I":
            case "U":
                return true;
            default:
                return false;
        }
    }

    private static boolean isVowel4(String line) {
        char[] chars = line.toCharArray();
        if (chars.length==1){
            char symbol = chars[0];
            if (symbol == 'e') return true;
            if (symbol == 'u') return true;
            if (symbol == 'o') return true;
            if (symbol == 'i') return true;
            if (symbol == 'I') return true;
            if (symbol == 'A') return true;
            if (symbol == 'E') return true;
            if (symbol == 'U') return true;
            if (symbol == 'O') return true;
            return symbol == 'a';
        }
        return false;
    }
}

