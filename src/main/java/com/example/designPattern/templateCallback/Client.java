package com.example.designPattern.templateCallback;

public class Client {
    public static void main(String[] args) {

        //람다식 사용
        FileProcessor plusFileProcessor = new FileProcessor("number.txt");
        int result1 = plusFileProcessor.process(((result, number) -> result+=number));
        System.out.println(result1);//15

        //익명 객체 사용
        FileProcessor plusFileProcessor2 = new FileProcessor("number.txt");
        int result2 = plusFileProcessor2.process(new Operator() {
            @Override
            public int getResult(int result, int number) {
                return result *= number;
            }
        });
        System.out.println(result2);//120
    }
}
