package com.example.designPattern.proxy.after2;

public class GameServiceProxy implements  GameService{

    private GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        /*Lazy Initialization*/
        /* 지연 로딩 외에도 특정 로직을 삽입하여 gameService를 원하는 객체로 끼울 수 있다. */
        if(this.gameService == null) this.gameService = new DefaultGameService();
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
