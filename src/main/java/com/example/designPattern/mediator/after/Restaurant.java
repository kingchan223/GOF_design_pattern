package com.example.designPattern.mediator.after;

import java.time.LocalDateTime;

public class Restaurant {

    private FrontDesk frontDesk = new FrontDesk();

    public void cleanResturant(){
        frontDesk.clean();
    }

    public void dinner(int id, LocalDateTime datetime) {
        System.out.println(id+"번 Guest의 저녁식사를 "+datetime+"에 준비해두겠습니다.");
    }
}
