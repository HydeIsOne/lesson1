package ru.geekbrains.homework6;

public class Dog extends Animal {
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;
    private static int counter = 0;

    public Dog(String name, int distance) {
        this.name = name;
        this.distance = distance;
        counter++;
    }

    public static int getCount() {
        return counter;
    }

    @Override
    public void run() {
        if (distance < maxRunDistance) {
            System.out.println("Собака " + name + " пробежала " + distance + " метров");
        } else {
            System.out.println("Собака " + name + " не смогла пробежать " + distance + " метров и остановилась на " + maxRunDistance);
        }

    }

    @Override
    public void swim() {
        if (distance < maxSwimDistance) {
            System.out.println("Собака " + name + " проплыла " + distance + " метров");
        } else {
            System.out.println("Собака " + name + " не смогла проплыть " + distance + " метров, поскольку сил хватило только на " + maxSwimDistance);
        }

    }
}