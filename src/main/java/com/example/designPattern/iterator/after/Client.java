package com.example.designPattern.iterator.after;

import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("디자인 패턴을 배워보아요 :)");
        board.addPost("모든 코더들은 디자인 패턴을 학습해야할까요?");

        //들어간 순서대로 조회
        List<Post> posts = board.getPosts();
        for (Post post : posts)
            System.out.println(post.getTitle());

        for(int i=0; i<posts.size(); i++){
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        //가장 최신글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();/*posts가 어떤 구조인지 몰라도 된다.*/
        while(recentPostIterator.hasNext()){
            System.out.println(recentPostIterator.next().getTitle());
        }
    }
}
