package ru.geekbrains.homework2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(checkSumTask1(5,10));
        positiveOrNegativeTask2(-20);
        System.out.println(positiveOrNegativeTask3(-1));
        printWordsTask4("something original", 2);
        System.out.println(leapYearCheckTask5(100));

    }

    public static boolean checkSumTask1(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void positiveOrNegativeTask2(int a) {
        if(a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean positiveOrNegativeTask3(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void printWordsTask4 (String word,int number) {
        for(int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }
    public static boolean leapYearCheckTask5(int year) {

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }
        else {
            return false;
        }
    }

}









