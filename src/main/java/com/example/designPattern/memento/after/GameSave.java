package com.example.designPattern.memento.after;

import lombok.Getter;

@Getter
/*Memento*/
public final class GameSave {
    /*final 키워드로 불변하도록 한다.*/
    private final int redTeamScore;
    private final int blueTeamScore;

    public GameSave(int redTeamScore, int blueTeamScore) {
        this.redTeamScore = redTeamScore;
        this.blueTeamScore = blueTeamScore;
    }
    /*setter는 불변하게 하기 위해 없다.*/
}
