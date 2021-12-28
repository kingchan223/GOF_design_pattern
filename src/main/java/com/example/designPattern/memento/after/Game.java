package com.example.designPattern.memento.after;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
/* Originator */
public class Game implements Serializable {

    private int redTeamScore;
    private int blueTeamScore;

    /*현재 상태 저장*/
    public GameSave save(){
        return new GameSave(this.redTeamScore, this.blueTeamScore);
    }

    /*이전 상태 복구*/
    public void restore(GameSave gameSave){
        this.redTeamScore = gameSave.getRedTeamScore();
        this.blueTeamScore = gameSave.getBlueTeamScore();
    }
}
