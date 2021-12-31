package com.example.designPattern.strategy.after;

public class Faster implements Speed{
    @Override
    public void blueLight() {
        System.out.println("무광꼬치");
    }

    @Override
    public void redLight() {
        System.out.println("펴씀다.");
    }
}
