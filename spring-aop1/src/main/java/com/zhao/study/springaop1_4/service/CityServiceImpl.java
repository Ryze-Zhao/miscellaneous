package com.zhao.study.springaop1_4.service;

import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Override
    public void query() {
        System.out.println("spring-init--------------------");
    }
}