package com.zhao.study.springaop1_3;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//可以这么理解被切的方法是一个记录，而 @Pointcut是一张表，而所有记录和表存在的地方，就是一个@Aspect切面
@Component
//切面
@Aspect
public class ZhaoAspect {
    //切点(下面这个配置是拦截这个路径下所有类的所有方法)
    @Pointcut(value = "execution(* com.zhao.study.springaop1_3.service..*.*(..))")
    public void pointCut() {
    }

    //通知（如；之前，之后等）
    @Before("pointCut()")
    public void before() {
        System.out.println("before---------------------------------");
    }
}
