package com.example.designPattern.mediator.before;

public class CleaningService {
    public void clean(Gym gym) {
        System.out.println("clean " + gym);
    }

    public void getTowel(Guest guest, int numberOfTowel) {
        System.out.println(numberOfTowel + " towels to " + guest);
    }

    public void clean(Restaurant restaurant) {
        System.out.println("clean " + restaurant);
    }
}

