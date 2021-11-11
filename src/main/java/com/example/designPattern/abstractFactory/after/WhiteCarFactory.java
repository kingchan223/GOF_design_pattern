package com.example.designPattern.abstractFactory.after;


import com.example.designPattern.abstractFactory.before.Car;
import com.example.designPattern.abstractFactory.before.DefaultCarFactory;


/*Client 코드*/
public class WhiteCarFactory extends DefaultCarFactory {

    private final CarPartsFactory carPartsFactory;

    public WhiteCarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car createCar() {
        Car car = new Car();
        car.setHandle(carPartsFactory.createHandle());
        car.setWheel(carPartsFactory.createWheel());
        return car;
    }
}
