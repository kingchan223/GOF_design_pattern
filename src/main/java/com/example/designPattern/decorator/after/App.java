package com.example.designPattern.decorator.after;

public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = false;
    private static boolean enabledDate = false;

    public static void main(String[] args) {

        CommentService commentService = new DefaultCommentService();
        /*런타임시에 추가된다.*/
        if (enabledSpamFilter)
            commentService = new SpamFilteringCommentDecorator(commentService);
        if (enabledTrimming)
            commentService = new TrimmingCommentDecorator(commentService);
        if(enabledDate)
            commentService = new DateCommentDecorator(commentService);

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("https://kingchan223.tistory.com");
    }
}
