package com.example.designPattern.proxy.in_java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerfAspect {

    @Around("bean(gameService)")/* 성능 측정을 gameService에 적용함 */
    public void timestamp(ProceedingJoinPoint point) throws Throwable {
        long before = System.currentTimeMillis();
        point.proceed();//gameService의 startGame 호출 효과
        System.out.println(System.currentTimeMillis() - before);
    }
}
