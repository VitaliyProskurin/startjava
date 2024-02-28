package com.startjava.lesson_2_3.person;

public class Person {

    String gender = "мужской";
    String name = "Виталий";
    float height = 1.85f;
    float weight = 92f;
    int age = 35;

    void move() {
        System.out.println("идет");
    }

    void sit() {
        System.out.println("сидит");
    }

    void run() {
        System.out.println("бежит");
    }

    void speak() {
        System.out.println("говорит");
    }

    void learn() {
        System.out.println("учит Java");
    }
}