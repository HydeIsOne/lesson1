package ru.geekbrains.j2homework3;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        task1();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Efimov", "890555555");
        phonebook.add("Sidorov","890233333");
        phonebook.add("Medvedev","89033333");
        phonebook.add("Efimov", "890111111");

        phonebook.get("Efimov");
        phonebook.get("Medvedev");

    }

    private static void task1() {
        Map<String, Integer> map = new HashMap<>();
        String[] words = {
                "Mercedes", "Audi", "BMW", "Lexus",
                "Genesis", "Audi", "KIA", "LADA", "BMW",
                "Range Rover", "Mazda"
        };
        // Вариант 1
        for (String word : words) {
            Integer count = map.getOrDefault (word, 0);
            map.put(word, count + 1);
        }
        System.out.println(map);
    }
    // Вариант 2.
//        for (int i = 0; i < words.length; i++) {
//            if (map.containsKey(words[i]))
//                map.put(words[i], map.get(words[i]) + 1);
//            else
//                map.put(words[i],1);
//            }
//        System.out.println(map);
//        }
//    }


    // Вариант 3.
//        for (String word : words) {
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//        System.out.println(map);
//    }



}

