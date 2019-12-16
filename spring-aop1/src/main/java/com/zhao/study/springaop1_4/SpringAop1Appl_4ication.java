package com.zhao.study.springaop1_4;

import com.zhao.study.springaop1_4.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAop1Appl_4ication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(ZhaoConfig.class);
        CityService proxyCityService = (CityService) ac.getBean("cityServiceImpl");
        proxyCityService.query();
    }
}
