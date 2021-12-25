package com.startjava.Lesson_2_3_4.robot;

public class JaegerTest {
   public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 6);
        System.out.println("Название - " + jaegerOne.getModelName() + " , марка - " + jaegerOne.getMark() + " , высота - " + jaegerOne.getHeight() + " , броня - " + jaegerOne.getArmor());
        jaegerOne.move();
        jaegerOne.useJetKick();

        Jaeger jaegerTwo = new Jaeger("Horizon Brave", "Mark-1", "China", 72.54f, 7.890f, 6);
        System.out.println("Название - " + jaegerTwo.getModelName() + " , марка - " + jaegerTwo.getMark() + " , высота - " + jaegerTwo.getHeight() + " , броня - " + jaegerTwo.getArmor());
        jaegerTwo.move();
        jaegerTwo.useFlashFreeze();
    }
}
        /*jaegerOne.setModelName("Crimson Typhoon");
        jaegerOne.setMark("Mark-4");
        jaegerOne.setOrigin("China");
        jaegerOne.setHeight(76.2f);
        jaegerOne.setWeight(1.722f);
        jaegerOne.setArmor(6);*/

        /*jaegerTwo.setModelName("Horizon Brave");
        jaegerTwo.setMark("Mark-1");
        jaegerTwo.setOrigin("China");
        jaegerTwo.setHeight(72.54f);
        jaegerTwo.setWeight(7.890f);
        jaegerTwo.setArmor(6);*/