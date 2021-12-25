package com.startjava.Lesson1.cycle;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + " ");
        }

        int counter = 6;
        while (counter >= -6) {
            System.out.println(counter + " ");
            counter -= 2;
        }

        int counter2 = 10;
        int sum = 0;
        do {
            if (counter2 % 2 != 0) {
                sum += counter2;
            } 
            counter2++;
        } while (counter2 <= 20);
        System.out.println("Сумма чисел: " + sum);
    }
}