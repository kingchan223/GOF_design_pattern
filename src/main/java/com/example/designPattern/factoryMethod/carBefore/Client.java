package com.example.designPattern.factoryMethod.carBefore;

public class Client {
    public static void main(String[] args) {
        Car whiteCar = CarFactory.orderCar("whiteCar", "kingchan@gmail.com");
        System.out.println(whiteCar);
        Car blackCar = CarFactory.orderCar("blackCar", "kingchan@gmail.com");
        System.out.println(blackCar);
    }
}
