package com.zhao.study.springaop1_2;


import org.springframework.context.annotation.Import;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Import(ZhaoPostProcessor.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
}
