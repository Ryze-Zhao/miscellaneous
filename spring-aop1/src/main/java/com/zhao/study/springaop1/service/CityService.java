package com.zhao.study.springaop1.service;

import org.springframework.stereotype.Component;

@Component
public class CityService {
    public void query() {
        System.out.println("spring-init--------------------");
    }
}