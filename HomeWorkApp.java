package ru.irinasla.HomeWork1;

public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    //Задание 2
    public static void printThreeWords() {
        System.out.println("Orange \n" +
                "Banana \n" +
                "Apple");
    }
    //Задание 3
    public static void checkSumSign() {
        int a = 10;
        int b = 5;
        int c = a + b;
        if (c > 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    //Задание 4
    public static void printColor() {
        int value = -100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    //Задание 5
    public static void compareNumbers() {
        int a = 5;
        int b = 4;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
