package com.zhao.study.springaop1_3;


import com.zhao.study.springaop1_3.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAop1_3Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(ZhaoConfig.class);
        AccountService bean = ac.getBean(AccountService.class);
        bean.query();
        bean.query1("aaaa",11);
        bean.setQuery();
    }
}
