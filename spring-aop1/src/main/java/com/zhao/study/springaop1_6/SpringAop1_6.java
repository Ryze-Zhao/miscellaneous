package com.zhao.study.springaop1_6;

import com.zhao.study.springaop1_6.service.CityService;
import com.zhao.study.springaop1_6.service.CityServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAop1_6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(ZhaoConfig.class);
//        CityServiceImpl.class
        CityService bean = (CityService) ac.getBean(CityService.class);
        bean.query();

    }
}
