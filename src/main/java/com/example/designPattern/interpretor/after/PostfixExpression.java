package com.example.designPattern.interpretor.after;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);
}
