package com.example.designPattern.visitor.after;

//concrete visitor
public class Phone implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("Print Circle to Phone");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Rectangle Circle to Phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Triangle Circle to Phone");
    }
}
