package ru.geekbrains.homework6;

public class Cat extends Animal {
    private final int maxRunDistance = 200;
    private final int maxSwimDistance = 0;
    private static int counter = 0;

    public Cat(String name, int distance) {
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
            System.out.println("Кошка " + name + " пробежала " + distance + " метров");
        } else {
            System.out.println("Кошка " + name + " не смогла пробежать " + distance + " метров и остановилась на " + maxRunDistance);
        }
    }

    @Override
    public void swim() {
        System.out.println("Кошка " + name + " не смогла проплыть " + distance + " метров, поскольку не умеет плавать");
    }
}