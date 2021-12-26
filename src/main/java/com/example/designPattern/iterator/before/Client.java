package com.example.designPattern.iterator.before;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("디자인 패턴을 배워보아요 :)");
        board.addPost("모든 코더들은 디자인 패턴을 학습해야할까요?");

        List<Post> posts = board.getPosts();
        for (Post post : posts) System.out.println(post.getTitle());

        posts.sort((p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (Post post : posts) System.out.println(post.getTitle());
    }
}
