package com.startjava.Lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 2; 
        // +, -, *, /, ^, % 
        char sign = '^';

        if (sign == '+') {
            System.out.println(a + b);
        } else if (sign == '-') {
            System.out.println(a - b);
        } else if (sign == '*') {
            System.out.println(a * b);
        } else if (sign == '/') {
            System.out.println(a / b);
        } else if (sign == '%') {
            System.out.println(a % b);
        } else if (sign == '^') {
            int degree = 1;
            for (int i = 1; i <= b; i++) {
                degree *= a;
            }
            System.out.println(degree);
        }
    }
}