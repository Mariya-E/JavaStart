package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts;
    private int[] numbers;
    private Player player;

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    public void setNumber(int number) {
        numbers[attempts] = number;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void clearNambers() {
        if (attempts > 0) {
            Arrays.fill(numbers, 0, attempts - 1, 0);
            attempts = 0;
        }
    }
}
