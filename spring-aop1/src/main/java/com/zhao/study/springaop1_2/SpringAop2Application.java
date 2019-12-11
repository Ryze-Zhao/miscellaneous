package com.zhao.study.springaop1_2;

import com.zhao.study.springaop1_2.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAop2Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(ZhaoConfig.class);
        //由于添加了接口，因此这个CityService实际跟包springaop1的类已经不同（springaop1的CityService等于springaop2的CityServiceImpl）
        ac.getBean(CityService.class).query();
    }
}
