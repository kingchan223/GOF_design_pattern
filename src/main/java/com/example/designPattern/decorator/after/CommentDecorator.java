package com.example.designPattern.decorator.after;

//wrapper. decorator
public class CommentDecorator implements CommentService {

    private CommentService commentService;//wrappee

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
