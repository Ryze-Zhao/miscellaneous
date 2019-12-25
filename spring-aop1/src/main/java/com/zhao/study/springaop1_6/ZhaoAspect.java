package com.zhao.study.springaop1_6;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ZhaoAspect {
    @Pointcut(value = "execution(* com.zhao.study.springaop1_6.service..*.*(..))")
    public void pointCut() {}
    @Before("pointCut()")
    public void before() {
        System.out.println("before---------------------------------");
    }
}
