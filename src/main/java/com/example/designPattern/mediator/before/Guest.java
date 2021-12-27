package com.example.designPattern.mediator.before;

public class Guest {

    private Restaurant restaurant = new Restaurant();

    private CleaningService cleaningService = new CleaningService();

    public void dinner() {
        restaurant.dinner(this);
    }

    public void getTowel(int numberOfTowel) {
        cleaningService.getTowel(this, numberOfTowel);
    }
}