package com.example.designPattern.templateCallback;

@FunctionalInterface
public interface Operator {
    int getResult(int result, int number);
}
