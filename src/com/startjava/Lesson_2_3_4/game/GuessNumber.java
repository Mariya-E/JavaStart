package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player playerOne;
    private final Player playerTwo;
    private int secretNumber;
    private Scanner scan;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void launch() {
        init();
        startGameplay();
    }

    private void init() {
        Random rand = new Random();
        secretNumber = rand.nextInt(100) + 1;
        scan = new Scanner(System.in);
        playerOne.clearNambers();
        playerTwo.clearNambers();
    }

    private void startGameplay() {
        System.out.println("У каждого игрока по 10 попыток!");
        tryToGuess();
        printNumbers(playerOne);
        printNumbers(playerTwo);
    }

    private void tryToGuess() {
        while (true) {
            if (isGuessed(playerOne)) {
                break;
            }
            if (isGuessed(playerTwo)) {
                break;
            }
            if (playerOne.getAttempts() == 10 || playerTwo.getAttempts() == 10) {
                break;
            }
        }
    }

    private boolean isGuessed(Player player) {
        String name = player.getName();
        System.out.println(name + ", введите число, загаданное компьютером");
        int number = scan.nextInt();
        player.setNumber(number);
        player.setAttempts(player.getAttempts() + 1);
        if (number == secretNumber) {
            System.out.println("Поздравляем! " + name + " угадал число с " + player.getAttempts() + " попытки");
            return true;
        }
        if (number > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }

        if (player.getAttempts() == 10) {
            System.out.println("У " + name + " закончились попытки");
        }
        return false;
    }

    private void printNumbers(Player player) {
        int[] numbers = player.getNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}