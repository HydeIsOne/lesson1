package ru.geekbrains.j2homework1;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Moves moves);

    public String getName() {
        return name;
    }
}