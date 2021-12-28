package com.example.designPattern.memento.in_java;

import com.example.designPattern.memento.after.Game;

import java.io.*;

public class MementoInJava {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /* Serializable */
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        /* 직렬화 */
        /* 파일에 score상태를 저장 */
        try(FileOutputStream fileOut = new FileOutputStream("GameSave.hex");
            ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(game);
        }

        game.setBlueTeamScore(25);
        game.setRedTeamScore(15);

        /* 역직렬화 */
        /* 파일에 score상태를 불러와서 restore하기 */
        try(FileInputStream fileIn = new FileInputStream("GameSave.hex");
            ObjectInputStream in = new ObjectInputStream(fileIn))
        {
            game = (Game) in.readObject();
            System.out.println(game.getBlueTeamScore());
            System.out.println(game.getRedTeamScore());
        }
    }
}
