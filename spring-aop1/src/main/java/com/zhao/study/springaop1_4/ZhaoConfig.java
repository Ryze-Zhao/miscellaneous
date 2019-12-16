package com.zhao.study.springaop1_4;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zhao.study.springaop1_4")
//proxyTargetClass = true更改为CGLIB代理方式
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ZhaoConfig {}
