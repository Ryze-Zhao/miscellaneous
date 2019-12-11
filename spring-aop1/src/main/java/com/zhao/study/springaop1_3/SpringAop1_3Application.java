package com.zhao.study.springaop1_3;


import com.zhao.study.springaop1_3.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAop1_3Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(ZhaoConfig.class);
        ac.getBean(CityService.class).query();
        ac.getBean(CityService.class).query();
    }
}
