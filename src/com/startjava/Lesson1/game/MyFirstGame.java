package com.startjava.Lesson1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Я загадываю число от 0 до 100! Какое число я загадал?:\n");
        int computerNumber = 55;

        for (int i = 1; i <= 100; i++) {
            if (i > computerNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (i < computerNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}
