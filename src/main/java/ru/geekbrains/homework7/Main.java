package ru.geekbrains.homework7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Муся", 50),
                new Cat("Дуся", 30),
                new Cat("Фруся", 8),
                new Cat("Дымка", 5)
        };

        Plate plate = new Plate(90);

        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            //plate.addFood(10);
            cat.info();
        }
    }
}
