package com.startjava.Lesson1.unicode;

public class Unicode {
    public static void main(String[] args) {
        System.out.print("Cимволы и коды:\n");
        for (int i = 33; i <= 126; i++) {
            char ch = (char) i;
            System.out.printf("%03d %3s%n", i, ch);
        }
    }
}