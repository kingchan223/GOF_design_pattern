package com.example.designPattern.chainOfResponsibility.after;

public class AuthRequestHandler extends RequestHandler{

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("요청자의 인증 상태를 확인합니다.");
        if(!request.getBody().split(":")[1].equals("인증OK"))
            System.out.println("인증이 완료된 사용자가 아닙니다. 어플리케이션을 종료합니다.");
        else
            super.handle(request);
    }
}
