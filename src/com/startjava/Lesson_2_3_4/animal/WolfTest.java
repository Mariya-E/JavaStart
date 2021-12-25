package com.startjava.Lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("Mona");
        wolfOne.setAge(10);
        System.out.println("Кличка - " + wolfOne.getName() + " , возраст - " + wolfOne.getAge() + " , окрас - " + wolfOne.getColor());
        wolfOne.run();
        wolfOne.hunt();
    }
}