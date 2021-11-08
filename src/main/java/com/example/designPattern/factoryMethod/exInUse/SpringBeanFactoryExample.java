package com.example.designPattern.factoryMethod.exInUse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ObjectInputFilter;
//테스트
public class SpringBeanFactoryExample {
    public static void main(String[] args) {
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);

        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hello2 = javaFactory.getBean("hello", String.class);
        System.out.println(hello2);
    }
}



