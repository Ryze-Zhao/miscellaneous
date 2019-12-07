package com.zhao.study.springaop1;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zhao")
@EnableAspectJAutoProxy
public class ZhaoConfig { }
