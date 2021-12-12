package ru.geekbrains.j2homework1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Moves[] moves = new Moves[3];

        int distance = random.nextInt(10);
        int height = random.nextInt(10);
        moves[0] = new Human("Petya", distance, height);

        distance = random.nextInt(10);
        height = random.nextInt(10);
        moves[1] = new Robot("R2D2", distance, height);

        distance = random.nextInt(10);
        height = random.nextInt(10);
        moves[2] = new Cat("Barsik", distance, height);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = random.nextInt(10);
            isRoad = random.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Road " + i, distance);
            } else {
                barriers[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < moves.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(moves[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успешно");
            } else {
                System.out.println("Не получилось");
            }
        }
    }
}

