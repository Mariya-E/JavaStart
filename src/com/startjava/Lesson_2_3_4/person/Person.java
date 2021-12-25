package com.startjava.Lesson_2_3_4.person;

public class Person {

    String name = "Alex";
    String gender = "mens";
    float height = 1.85f;
    float weight = 71.5f;
    int age = 33;

    boolean sit() {
        System.out.println("Вы сидите!");
        return true;
    }

    void walk() {
        System.out.println("Вы идете!");
    }

    String studyJava() {
        return "учить Java";
    }

    void run() {
        
    }

    void speak() {
        
    }
}