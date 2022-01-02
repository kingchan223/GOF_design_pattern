package com.example.designPattern.visitor.after;

public class IPad implements Device{
    @Override
    public void print(Circle circle) {
        System.out.println("Print Circle to IPad");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Print Circle to IPad");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Print Circle to IPad");
    }
}
