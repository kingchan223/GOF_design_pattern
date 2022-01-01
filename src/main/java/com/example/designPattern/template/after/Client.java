package com.example.designPattern.template.after;

public class Client {
    public static void main(String[] args) {
        PlusFileProcessor plusFileProcessor = new PlusFileProcessor("number.txt");
        int result1 = plusFileProcessor.process();
        System.out.println(result1);//15

        MulFileProcessor mulFileProcessor = new MulFileProcessor("number.txt");
        int result2 = plusFileProcessor.process();
        System.out.println(result2);//120
    }
}
