package com.example.designPattern.proxy.before;

import com.example.designPattern.proxy.after1.GameServiceProxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
