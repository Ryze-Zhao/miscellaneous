package com.zhao.study.springaop1_2;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zhao.study.springaop1_2")
//这个注解实际开启了一个后置处理器（原有6个，这个开启后有7个，AnnotationAwareAspectJAutoProxyCreator）
//@EnableAspectJAutoProxy
@Annotation
public class ZhaoConfig { }
