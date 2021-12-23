package com.example.designPattern.chainOfResponsibility.before;

public class Request {
    String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
