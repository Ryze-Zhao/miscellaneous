package com.zhao.study.springaop1_6.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("c")
public class CityServiceImpl implements CityService {
    @Override
    public void query() {
        System.out.println("spring-init--------------------");
    }
}