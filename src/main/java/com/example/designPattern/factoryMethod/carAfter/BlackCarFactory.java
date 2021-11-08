package com.example.designPattern.factoryMethod.carAfter;

public class BlackCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new BlackCar();
    }
}
