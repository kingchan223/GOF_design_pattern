package com.example.designPattern.visitor.after;

//element
public class Circle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
