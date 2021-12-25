package com.startjava.Lesson_2_3_4.animal;

public class Wolf {

    private String name = "Shiry";
    private String animalGender = "male";
    private String color = "gray";
    private float weight = 87.5f;
    private int age = 5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(String animalGender) {
        this.animalGender = animalGender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
     }

    public boolean sit() {
        System.out.println("Волк сидит!");
        return true;
    }

    public void walk() {
        System.out.println("Волк идет!");
    }

    public String howl() {
        return "выть";
    }

    public void run() {
        System.out.println("Волк бежит!");
    }

    public void hunt() {
        System.out.println("Волк охотится!");
    }
}