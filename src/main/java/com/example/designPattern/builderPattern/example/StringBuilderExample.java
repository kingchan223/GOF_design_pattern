package com.example.designPattern.builderPattern.example;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.stream.Stream;

public class StringBuilderExample {

    public static void main(String[] args) {

        //String Builder
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("John").append("-").append("Lenon").toString();
        System.out.println(result);

        //Stream Builder
        Stream.Builder<String> stringStreamBuilder = Stream.builder();
        Stream<String> names = stringStreamBuilder.add("John").add("-").add("Lenon").build();
        names.forEach(System.out::println);

        UriComponents uri = UriComponentsBuilder.newInstance()
                                                .scheme("http")
                                                .host("www.whiteship.me")
                                                .path("java-playlist-ep1")
                                                .build();
        System.out.println(uri);


    }
}
