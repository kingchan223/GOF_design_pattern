package com.example.designPattern.abstractFactory.before;


public class WhiteCarFactory extends DefaultCarFactory{

    @Override
    public Car createCar() {
        Car car = new Car();
        car.setHandle(new WhiteHandle());//WhiteHandle이 다른 규격으로 바뀐다면??
        car.setWheel(new WhiteWheel());//WhiteWheel이 다른 규격으로 바뀐다면?
        return car;
    }
}
