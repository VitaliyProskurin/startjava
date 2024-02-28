package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Bracer Phoenix");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("China");
        jaegerOne.setHeight(70.91f);
        jaegerOne.setWeight(2.2f);
        jaegerOne.setSpeed(25);
        jaegerOne.setStrength(75);
        jaegerOne.setArmor(55);
        jaegerOne.displayInfo();
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();


        Jaeger jaegerTwo = new Jaeger("Guardian Bravo", "Mark-6", "Japan", 73.21f, 
                2.18f, 35, 70, 60);
        jaegerTwo.displayInfo();
        jaegerTwo.drift();
        jaegerTwo.useVortexCannon();
        jaegerTwo.useCoreSalvoCharges();
    }
}