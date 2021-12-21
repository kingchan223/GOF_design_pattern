package com.example.designPattern.decorator.in_java;

import java.awt.print.Book;
import java.util.*;

public class DecoratorInJava {
    public static void main(String[] args) {
        /*  감싸면서 기능들이 추가된다.  */
        ArrayList list = new ArrayList<>();
        list.add(new Book());
        // Collections.checkedList는 일반적인 콜렉션 List에 Book.class외의
        //타입을 넣으려하면 에러를 발생시킨다.
        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());//여기에는 들어가지만
        books.add(new Item());//여기에서는 런타임 에러 발생

        Collection synchronizedList = Collections.synchronizedCollection(books);//하나의 스레드만 접근할 수 있도록 만들어준다.
        List unmodifiableList = Collections.unmodifiableList(books);//불변객체로 만들어 준다.
    }

    private static class Item {
    }
}
