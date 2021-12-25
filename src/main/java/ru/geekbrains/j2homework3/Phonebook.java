package ru.geekbrains.j2homework3;

import java.util.*;

public class Phonebook {
    private Map<String, HashSet<String>> map;

    Phonebook() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> numbers;
        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);
    }

    public HashSet<String> get(String lastName) {
        System.out.println(lastName + ": " + map.get(lastName));
        return map.get(lastName);
    }
}
