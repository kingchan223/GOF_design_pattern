package com.example.designPattern.mediator.before;

import java.time.LocalDateTime;

public class Restaurant {

    private CleaningService cleaningService = new CleaningService();

    public void dinner(Guest guest) {
        System.out.println("dinner " + guest);
    }

    public void clean() {
        cleaningService.clean(this);
    }

    public void dinner(int id, LocalDateTime datetime) {
        System.out.println(id+"번 Guest의 저녁식사를 "+datetime+"에 준비해두겠습니다.");
    }
}
