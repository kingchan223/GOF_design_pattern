package com.example.designPattern.singleton;

import com.example.designPattern.DesignPatternApplication;
import com.example.designPattern.singleton.Settings;
import org.springframework.boot.SpringApplication;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings settings = Settings.INSTANCE;
        Settings settings1 = null;

        // 직렬화 역직렬화 사용하기
        //직렬화
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(settings);
        }
        //역직렬화
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings1 = (Settings) in.readObject();
        }
        System.out.println(settings == settings1);

        SpringApplication.run(DesignPatternApplication.class, args);
    }
}
