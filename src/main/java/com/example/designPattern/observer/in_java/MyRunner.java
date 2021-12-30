package com.example.designPattern.observer.in_java;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
/* ApplicationRunner: 스프링이 실행되었을 때 자동으로 실행된다.*/
@Component
public class MyRunner implements ApplicationRunner {

    private ApplicationEventPublisher publisher;

    public MyRunner(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        publisher.publishEvent(new MyEvent("hello spring event"));
    }
}
