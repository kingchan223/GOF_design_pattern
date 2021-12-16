package com.example.designPattern.prototype.in_java;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public class Student {
    String name;

    @Override
    public String toString() {
        return this.name;
    }
}
