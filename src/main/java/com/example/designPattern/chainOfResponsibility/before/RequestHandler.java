package com.example.designPattern.chainOfResponsibility.before;

public class RequestHandler {
    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
/* 단일 책임 원칙을 지킬 수 있게된다.  */

