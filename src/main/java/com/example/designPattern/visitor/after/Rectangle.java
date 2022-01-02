package com.example.designPattern.visitor.after;

//element
public class Rectangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}

