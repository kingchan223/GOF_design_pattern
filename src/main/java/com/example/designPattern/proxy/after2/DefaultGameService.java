package com.example.designPattern.proxy.after2;

// Real Subject interface
public class DefaultGameService implements  GameService{
    @Override
    public void startGame() {
        System.out.println("게임을 시작합니다!");
    }
}
