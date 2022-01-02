package com.example.designPattern.visitor.after;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();
        rectangle.accept(device);
    }
}
