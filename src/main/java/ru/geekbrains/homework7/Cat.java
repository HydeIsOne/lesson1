package ru.geekbrains.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info () {
        String isHungry = !hungry ? "наелась, скушав " + appetite : "осталась голодная";
        System.out.println(name + " " + isHungry);
    }

    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}
