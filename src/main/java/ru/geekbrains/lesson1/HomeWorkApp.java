package ru.geekbrains.lesson1;

public class HomeWorkApp {
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static void checkSumSign() {
            int a = 5;
            int b = 10;
            if (a+b > 0) {
                System.out.println("Сумма положительная");
            }
            else {
                System.out.println("Сумма отрицательная");
            }
        }
        public static void printColor() {
            int value = 0;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            } else if (value > 100) {
                System.out.println("Зеленый");
            }
        }
        public static void compareNumbers() {
            int a = 5;
            int b = 4;
            System.out.println(a >= b ? ("a >= b") : ("a < b"));
        }
    }
