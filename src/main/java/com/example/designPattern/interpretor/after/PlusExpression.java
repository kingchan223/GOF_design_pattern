package com.example.designPattern.interpretor.after;

import java.util.Map;
//Non Terminal Expression
public class PlusExpression implements PostfixExpression {

    private PostfixExpression left;

    private PostfixExpression right;

    public PlusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
