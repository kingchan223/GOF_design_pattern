package com.example.designPattern.template.after;

public class MulFileProcessor extends FileProcessor{

    public MulFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        return result *= number;
    }
}
