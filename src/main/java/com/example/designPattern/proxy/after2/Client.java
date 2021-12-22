package com.example.designPattern.proxy.after2;

public class Client {
    public static void main(String[] args) {
        /*Client가 DefaultGameService를 쓰기 위해서는 프록시를 거쳐서 써야한다.*/
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
