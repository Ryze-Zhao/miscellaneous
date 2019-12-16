package com.zhao.study.springaop1_5;

import com.zhao.study.springaop1_5.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAop1_5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ZhaoConfig.class);
        ac.getBean(CityService.class).query("测试参数");
    }
}
