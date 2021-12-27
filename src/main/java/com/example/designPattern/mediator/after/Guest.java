package com.example.designPattern.mediator.after;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Guest {
    private int id;
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowels(int numberOfTowels){
        this.frontDesk.getTowels(this, numberOfTowels);
    }

    private void dinner(LocalDateTime datetime){
        this.frontDesk.dinner(this, datetime);
    }
}
