package com.example.designPattern.decorator.after;

/*Concrete Component*/
public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
