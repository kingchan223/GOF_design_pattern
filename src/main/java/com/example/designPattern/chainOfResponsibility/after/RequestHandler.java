package com.example.designPattern.chainOfResponsibility.after;



//다음 필터로 이어지는 추상 클래스가 필요하기 때문에 interface가 아닌 abstract클래스로 만든다.
public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request){
        if(nextHandler != null )
            nextHandler.handle(request);

    }
}
