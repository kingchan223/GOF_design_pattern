package com.example.designPattern.factoryMethod.carAfter;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.order(new WhiteCarFactory(),"whiteCar", "kingchan@gmail.com" );
        client.order(new BlackCarFactory(),"blackCar", "kingchan@gmail.com" );


        client.order(new WhiteCarFactory(),"whiteCar", "kingchan@gmail.com" );
        client.order(new BlackCarFactory(),"blackCar", "kingchan@gmail.com" );
        Car whiteCar2 = new WhiteCarFactory().orderCar("whiteCar2", "kingchan@gmail.com");
        Car blackCar2 = new BlackCarFactory().orderCar("blackCar2", "kingchan@gmail.com");
    }

    private void order(CarFactory carFactory, String name, String email) {
        System.out.println(carFactory.orderCar(name, email));
    }
}
