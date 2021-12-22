package com.example.designPattern.proxy.before;

public class GameService {
    public void startGame() throws InterruptedException {
        System.out.println("게임을 시작합니다!");
        Thread.sleep(1000L);
    }
}
