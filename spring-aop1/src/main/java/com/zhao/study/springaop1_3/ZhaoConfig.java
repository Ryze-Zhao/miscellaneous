package com.zhao.study.springaop1_3;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zhao.study.springaop1_3")
@EnableAspectJAutoProxy
public class ZhaoConfig { }
