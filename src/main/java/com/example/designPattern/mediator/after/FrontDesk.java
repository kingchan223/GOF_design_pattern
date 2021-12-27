package com.example.designPattern.mediator.after;



import java.time.LocalDateTime;

/* Mediator */
public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();

    public void getTowels(Guest guest, int numberOfTowels) {
        cleaningService.getTowels(guest.getId(), numberOfTowels);
    }

    public String getRoomNumberFor(int guestId) {
        return guestId + "의 room number";
    }

    public void dinner(Guest guest, LocalDateTime datetime) {
        restaurant.dinner(guest.getId(), datetime);
    }

    public void clean(){
        cleaningService.clean();
    }
}
