package com.example.designPattern.template.before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MulFileProcessor {

    private String path;
    public MulFileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            int result = 0;
            String line = "";
            while((line = reader.readLine())!=null)
                result *= Integer.parseInt(line);

            return result;
        }catch(IOException e){
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.");
        }
    }
}


//코드의 많은 부분이 중복된다.