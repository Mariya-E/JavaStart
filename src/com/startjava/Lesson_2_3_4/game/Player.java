package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
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
}