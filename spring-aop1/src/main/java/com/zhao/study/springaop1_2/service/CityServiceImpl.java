package com.zhao.study.springaop1_2.service;

import org.springframework.stereotype.Component;

@Component
public class CityServiceImpl implements CityService {
    @Override
    public void query() {
        System.out.println("spring-init--------------------");
    }
}