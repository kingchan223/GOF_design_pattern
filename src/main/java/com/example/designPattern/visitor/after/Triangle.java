package com.example.designPattern.visitor.after;

//element
public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
