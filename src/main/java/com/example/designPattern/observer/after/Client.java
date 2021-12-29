package com.example.designPattern.observer.after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("lee");
        User user2 = new User("wang");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);//user1, 2 모두 "오징어게임" 방에 참가(구독)

        chatServer.register("디자인패턴", user1);//user1만 "디자인패턴" 방에 참가(구독)

        chatServer.sendMessage(user1, "오징어게임", "아.. 이름이 기억났어.. 일남이야.. 오일남");//user1이 "오징어게임"방에 메시지 전달
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴으로 만든 채팅");//user2가 "디자인패턴"방에 메시지 전달


        chatServer.unregister("디자인패턴", user2);

        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴 장, 단점 보는 중");
    }
}
