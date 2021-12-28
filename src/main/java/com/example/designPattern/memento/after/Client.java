package com.example.designPattern.memento.after;


public class Client {
    public static void main(String[] args) {

        Game game = new Game();
        /* 게임 초반의 상태 */
        game.setBlueTeamScore(10);
        game.setBlueTeamScore(20);

        /* 게임의 state 정보를 GameSave에 저장 (여기서 Client는 CareTaker가 된다.)*/
        GameSave memento = game.save();

        /* game의 정보 수정 */
        game.setRedTeamScore(12);
        game.setBlueTeamScore(22);

        /* game을  memento에 저장된 정보로 restore */
        game.restore(memento);
        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
