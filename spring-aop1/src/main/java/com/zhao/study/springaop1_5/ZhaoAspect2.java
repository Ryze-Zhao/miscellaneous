package com.zhao.study.springaop1_5;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class ZhaoAspect2 {
    @Pointcut(value = "execution(* com.zhao.study.springaop1_5.service..*.*(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void before() {
        System.out.println("ZhaoAspect2-----------------before---------------------------------");
    }
    @After("pointCut()")
    public void after() {
        System.out.println("ZhaoAspect2-----------------after---------------------------------");
    }
    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("ZhaoAspect2-----------------around---------------------------------start");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("ZhaoAspect2-----------------around---------------------------------end");
    }
    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("ZhaoAspect2-----------------afterReturning---------------------------------");
    }
    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing2---------------------------------");
    }
}
