package com.zhao.study.springaop1_5.service;

import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Override
    public void query(String string) {
        System.out.println("spring-init--------------------");
    }
}