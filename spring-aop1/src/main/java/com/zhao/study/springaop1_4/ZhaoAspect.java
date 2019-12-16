package com.zhao.study.springaop1_4;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ZhaoAspect {
    @Pointcut(value = "target(com.zhao.study.springaop1_4.service.CityServiceImpl)")
    public void pointCut() {}
    @Before("pointCut()")
    public void before() {
        System.out.println("before---------------------------------");
    }
}
