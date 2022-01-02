package com.example.designPattern.visitor.after;

//visitor
public interface Device {

    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
