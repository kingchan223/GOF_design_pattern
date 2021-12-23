package com.example.designPattern.chainOfResponsibility.before;

public class LoggingRequestHandler extends RequestHandler{
    public void handler(Request request) {
        // 로깅 관련 로직...
        super.handler(request);
    }
}
/* 단일 책임 원칙을 지키게 된다. */

