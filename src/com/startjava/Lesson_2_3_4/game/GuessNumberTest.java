package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру \"Угадай число\". Я загадываю число от 0 до 100! Какое число я загадал?");

        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(scan.next());
        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(scan.next());

        GuessNumber game = new GuessNumber(playerOne, playerTwo);

        String answer;
        do {
            game.launch();
            System.out.println("Хотите продолжить игру? [yes/no]");
            while (true) {
                answer = scan.next();
                if (answer.equals("no") || answer.equals("yes")) {
                    break;
                } else {
                    System.out.println("Введите допустимый ответ");
                }
            }
        } while (answer.equals("yes"));

        System.out.println("Программа завершается");
        scan.close();
    }
}