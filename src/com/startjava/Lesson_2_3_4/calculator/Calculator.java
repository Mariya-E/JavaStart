package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String expression) {
        String[] array = expression.split(" ");
        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[2]);

        return switch (array[1]) {
            case "+" -> Math.addExact(num1, num2);
            case "-" -> Math.subtractExact(num1, num2);
            case "*" -> Math.multiplyFull(num1, num2);
            case "/" -> (double) num1 / num2;
            case "%" -> num1 % num2;
            case "^" -> Math.pow(num1, num2);
            default -> 0;
        };
    }
}