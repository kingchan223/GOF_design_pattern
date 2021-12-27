package com.example.designPattern.mediator.after;


public class CleaningService {
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowels(int guestId, int numberOfTowels){
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println(roomNumber+ "에 "+numberOfTowels+"개의 towel들을 배달했습니다.");
    }

    public void clean() {
        System.out.println("청소하기");
    }
}

