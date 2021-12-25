package com.startjava.Lesson1.statement;

public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 34;
        if(age > 20) {
            System.out.println("Ваш возраст больше 20");
        }

        char gender = 'F';
        if(gender == 'M') {
            System.out.println("Вы выбрали значение пола - мужской");
        }

        if(gender !='M') {
            System.out.println("Ваше значение пола не определено");
        }

        float height = 1.90f;
        if(height < 1.80) {
            System.out.println("Ваш рост меньше 1.80");
        } else {
            System.out.println("Ваш рост больше 1.80");
        }

        char firstLetterName = 'D'; 
        if(firstLetterName == 'M') {
            System.out.println("Первая буква вашего имени М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква вашего имени I");
        } else {
            System.out.println("Первая буква вашего имени не определена");
        }
    }
}
