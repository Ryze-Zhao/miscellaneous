package com.zhao.study.springaop1;

import com.zhao.study.springaop1.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAop1Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(ZhaoConfig.class);
        ac.getBean(CityService.class).query();
    }
}
