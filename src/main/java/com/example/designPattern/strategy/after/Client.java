package com.example.designPattern.strategy.after;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight();

        // blue와 red가 각각 행동이 다르게 하고 싶다면 아래와 같다.
        blueLightRedLight.blueLight(new Slower());
        blueLightRedLight.redLight(new Faster());
    }
}
