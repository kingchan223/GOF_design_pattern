package com.example.designPattern.factoryMethod.carBefore;

public class CarFactory {
    public static Car orderCar(String name, String email) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("자동차 이름을 지어주세요");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }
        prepareFor(name);
        Car car = new Car();
        car.setName(name);
        if(name.equalsIgnoreCase("whiteCar")){
            car.setColor("white");
            car.setLogo("🚐");
        }
        else if(name.equalsIgnoreCase("blackCar")){
            car.setColor("black");
            car.setLogo("🚓");
        }
        sendEmailTo(email, car);
        return car;
    }
    private static void sendEmailTo(String email, Car car) {
        System.out.println("to "+email+". "+car+" 다 만들었습니다.");
    }
    private static void prepareFor(String name) {
        System.out.println(name+"을 만들 준비중입니다.");
    }
}









