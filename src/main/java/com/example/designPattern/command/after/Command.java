package com.example.designPattern.command.after;

//execute만 필요하다면 자바의 Runnable을 사용해도 된다.
public interface Command {
    void execute();
    void undo();
}
