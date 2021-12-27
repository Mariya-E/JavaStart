package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.println("Введите математическое выражение: ");
            String expression = scanner.nextLine();

            System.out.println(Calculator.calculate(expression));

            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
                if (answer.equals("yes") || answer.equals("no")) {
                    break;
                } else {
                    System.out.println("Введите допустимый ответ");
                }
            }
        } while (answer.equals("yes"));

        System.out.println("Программа завершается");
        scanner.close();
    }
}