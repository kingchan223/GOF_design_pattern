package com.example.designPattern.observer.in_java;

import java.util.Observable;
import java.util.Observer;

public class ObserverInJava {

    static class User implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println(arg);
        }
    }

    static class Subject extends Observable {
        public void add(String message){
            setChanged();//상태변경이 되어야만
            notifyObservers(message);//메시지를 받을 수 있다.
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User user = new User();
        subject.addObserver(user);
        subject.add("Hello Java Observer");
    }
}
