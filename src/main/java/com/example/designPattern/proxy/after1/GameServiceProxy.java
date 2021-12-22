package com.example.designPattern.proxy.after1;

import com.example.designPattern.proxy.before.GameService;

public class GameServiceProxy extends GameService {

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
