package com.example.designPattern.visitor.after;

//concrete visitor
public class Watch implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("Print Circle to Watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Rectangle Circle to Watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Triangle Circle to Watch");
    }
}
