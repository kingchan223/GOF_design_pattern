package com.example.designPattern.command.after;

import com.example.designPattern.command.before.Game;

public class MyApp {

    private Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();//인터페이스에 정의된 excute만을 사용한다.
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new GameStartCommand(new Game()));
        myApp.press();
    }
}
