package com.example.designPattern.chainOfResponsibility.before;

public class AuthRequestHandler extends RequestHandler{
    public void handler(Request request) {
        // 인증 확인 로직...
        // 핸들러 사용 가능 유저인지 확인...
        super.handler(request);
    }
}
/* 단일 책임 원칙을 지키게 된다. */

