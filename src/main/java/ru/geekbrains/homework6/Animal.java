package ru.geekbrains.homework6;

public class Animal {
    protected String name;
    protected int distance;
    private static int counter = 0;

    public static int getCount() {
        return counter;
    }

    public void run() {
        System.out.println(name + " пробежала " + distance);
        counter++;
    }

    public void swim() {
        System.out.println(name + " проплыла " + distance);
    }
}