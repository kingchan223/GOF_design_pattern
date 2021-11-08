package com.example.designPattern.factoryMethod.carAfter;

public interface CarFactory {

    default Car orderCar(String name, String email){
        validate(name, email);
        prepareFor(name);
        Car car = createCar();
        sendEmailTo(email, car);
        return car;
    }

    private void sendEmailTo(String email, Car car) {
        System.out.println("to "+email+". "+car+" 다 만들었습니다.");
    }

    Car createCar();


    private void validate(String name, String email){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("자동차 이름을 지어주세요");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name+"을 만들 준비중입니다.");
    }
}
