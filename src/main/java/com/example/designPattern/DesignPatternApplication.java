package com.example.designPattern;

import com.example.designPattern.singleton.SpringConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args){
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		String hello = ac.getBean("hello", String.class);
		String hello2 = ac.getBean("hello", String.class);
		System.out.println(hello == hello2);
	}
}



