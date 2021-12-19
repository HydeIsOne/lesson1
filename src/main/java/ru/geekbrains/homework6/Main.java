package ru.geekbrains.homework6;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Муся", 300),
                new Cat("Дымка", 150),
                new Cat("Дуся", 150),
                new Dog("Бобик", 200),
                new Dog("Шарик", 5),
                new Dog("Васян", 20),
                new Dog("Васян", 500),
        };

        for (int i = 0; i < 1; i++) {
            animals[0].run();
            animals[1].run();
            animals[2].swim();
            animals[3].run();
            animals[4].swim();
            animals[5].swim();
            animals[6].run();

        }
        System.out.println("Всего кошек: " + Cat.getCount());
        System.out.println("Всего собак: " + Dog.getCount());
        System.out.println("Всего животных: " + (Cat.getCount() + Dog.getCount()));
    }
}