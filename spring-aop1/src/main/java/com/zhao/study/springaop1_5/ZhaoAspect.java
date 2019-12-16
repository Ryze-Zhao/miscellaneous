package com.zhao.study.springaop1_5;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ZhaoAspect {
    @Pointcut(value = "execution(* com.zhao.study.springaop1_5.service..*.*(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void before() {
        System.out.println("ZhaoAspect-----------------before---------------------------------");
    }
    @After("pointCut()")
    public void after() {
        System.out.println("ZhaoAspect-----------------after---------------------------------");
    }
    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("ZhaoAspect-----------------around---------------------------------start");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("ZhaoAspect-----------------around---------------------------------end");
    }
    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("ZhaoAspect-----------------afterReturning---------------------------------");
    }
    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing---------------------------------");
    }
}
