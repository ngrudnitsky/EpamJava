package by.it.nickgrudnitsky.homework1.mainTask2.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] date = new int[3];

        System.out.println("Enter day.");

        try {
            if ((date[0] = scanner.nextInt()) <= 0 ) {
                System.out.println("Day must be positive.");
            }
            if ((date[1] = scanner.nextInt()) <= 0) {
                System.out.println("Mont must be positive.");
            }
            if ((date[2] = scanner.nextInt()) <= 0) {
                System.out.println("The year should not be negative.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input data, try again.");
            return;
        }

        int[] newDate = nextDay(date);
        if (newDate[0] == date[0]) {
            System.out.println("Wrong date.");
        } else System.out.printf("Next day is %d/%d/%d", newDate[0], newDate[1], newDate[2]);
    }

    private static int[] nextDay(int[] date) {
        int[] newDate = new int[3];
        int day = date[0];
        int month = date[1];
        int year = date[2];

        if (month > 12) {
            return date;
        }

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            month = 0;
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                month = 0;
            }
        }
        switch (month) {
            case 0:
                if (day > 29) {
                    break;
                }
                if (day == 29) {
                    month = 3;
                    day = 1;
                } else {
                    day += 1;
                    month = 2;
                }
                break;
            case 1:
                if (day > 31) {
                    break;
                }
                if (day == 31) {
                    month = 2;
                    day = 1;
                } else day += 1;
                break;
            case 2:
                if (day > 28) {
                    break;
                }
                if (day == 28) {
                    month = 3;
                    day = 1;
                } else day += 1;
                break;
            case 3:
                if (day > 31) {
                    break;
                }
                if (day == 31) {
                    month = 4;
                    day = 1;
                } else day += 1;
                break;
            case 4:
                if (day > 30) {
                    break;
                }
                if (day == 30) {
                    month = 5;
                    day = 1;
                } else day += 1;
                break;
            case 5:
                if (day > 31) {
                    break;
                }
                if (day == 31) {
                    month = 6;
                    day = 1;
                } else day += 1;
                break;
            case 6:
                if (day > 30) {
                    break;
                }
                if (day == 30) {
                    month = 7;
                    day = 1;
                } else day += 1;
                break;
            case 7:
                if (day > 31) {
                    break;
                }
                if (day == 31) {
                    month = 8;
                    day = 1;
                } else day += 1;
                break;
            case 8:
                if (day > 31) {
                    break;
                }
                if (day == 31) {
                    month = 9;
                    day = 1;
                } else day += 1;
                break;
            case 9:
                if (day > 30) {
                    break;
                }
                if (day == 30) {
                    month = 10;
                    day = 1;
                } else day += 1;
                break;
            case 10:
                if (day > 31) {
                    break;
                }
                if (day == 31) {
                    month = 11;
                    day = 1;
                } else day += 1;
                break;
            case 11:
                if (day > 30) {
                    break;
                }
                if (day == 30) {
                    month = 12;
                    day = 1;
                } else day += 1;
                break;
            case 12:
                if (day > 31) {
                    break;
                }
                if (day == 31) {
                    month = 1;
                    day = 1;
                    year += 1;
                } else day += 1;
                break;
        }

        newDate[0] = day;
        newDate[1] = month;
        newDate[2] = year;
        return newDate;
    }
}

