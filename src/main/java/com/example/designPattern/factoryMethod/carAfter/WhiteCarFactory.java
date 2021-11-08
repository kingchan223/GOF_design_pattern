package com.example.designPattern.factoryMethod.carAfter;


public class WhiteCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new WhiteCar();
    }
}
