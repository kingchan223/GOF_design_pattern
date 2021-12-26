package com.example.designPattern.interpretor.after2;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);
    static PostfixExpression plus(PostfixExpression left, PostfixExpression right){
//        return new PostfixExpression(){
//            @Override
//            public int interpret(Map<Character, Integer> context) {
//                return left.interpret(context) + right.interpret(context);
//            }
//        };
        return context -> left.interpret(context) + right.interpret(context);
    }

    static PostfixExpression minus(PostfixExpression left, PostfixExpression right){
        return context -> left.interpret(context) - right.interpret(context);
    }

    static PostfixExpression variable(Character c){
        return context -> context.get(c);
    }
}
