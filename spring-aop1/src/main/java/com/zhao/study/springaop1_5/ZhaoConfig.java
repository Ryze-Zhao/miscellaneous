package com.zhao.study.springaop1_5;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zhao.study.springaop1_5")
@EnableAspectJAutoProxy
public class ZhaoConfig {}
