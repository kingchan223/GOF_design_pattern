package com.example.designPattern.decorator.after;
import java.time.LocalDateTime;

/*Concrete Decorator*/
public class DateCommentDecorator extends CommentDecorator {

    public DateCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(addDate(comment));
    }

    private String addDate(String comment) {
        return comment+" ["+LocalDateTime.now()+"]";
    }
}
