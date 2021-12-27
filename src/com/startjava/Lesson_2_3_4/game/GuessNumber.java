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
        startGuessing();
    }

    private void init() {
        Random rand = new Random();
        secretNumber = rand.nextInt(100) + 1;
        scan = new Scanner(System.in);
        nullifyAttempts(playerOne);
        nullifyAttempts(playerTwo);
    }

    private void nullifyAttempts(Player player) {
        int attempts = player.getAttempts();
        if (attempts > 0) {
            int[] numbers = player.getNumbers();
            Arrays.fill(numbers, 0, attempts - 1, 0);
        }
        player.setAttempts(0);
    }

    private void startGuessing() {
        System.out.println("У каждого игрока по 10 попыток!");
        tryToGuess();
        printNumbers(playerOne);
        System.out.println();
        printNumbers(playerTwo);
        System.out.println();
    }

    private void tryToGuess() {
        while (true) {
            if (isGuessed(playerOne)) {
                break;
            }
            if (isGuessed(playerTwo)) {
                break;
            }
            int playerOneAttempts = playerOne.getAttempts();
            int playerTwoAttempts = playerTwo.getAttempts();
            if (playerOneAttempts == 10 || playerTwoAttempts == 10) {
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
        } else if (number > secretNumber) {
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
        int[] filledNumbers = Arrays.copyOf(numbers, player.getAttempts());
        for (int filledNumber : filledNumbers) {
            System.out.print(filledNumber + " ");
        }
    }
}