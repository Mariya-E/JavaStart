package com.startjava.Lesson1.variable;

public class Variable {

    public static void main(String[] args) {
        byte windows = 10;
        short memory = 8;
        int systemType = 64 ;
        long core = 4300;
        float cores = 2.0f;
        double baseSpeed = 2.5f;
        char cpuIndex = 'U';
        boolean comp = true;

        System.out.println("Ваша система Windows " + windows);
        System.out.println("Количество памяти " + memory);
        System.out.println("Разрядность системы " + systemType);
        System.out.println("Модель процессора " + core);
        System.out.println("Количество ядер процессора " + cores);
        System.out.println("Базовая частота процессора в Mhz " + baseSpeed);
        System.out.println("Index процессора " + cpuIndex);
        System.out.println("Данные компьютера верны " + comp);
    }
}