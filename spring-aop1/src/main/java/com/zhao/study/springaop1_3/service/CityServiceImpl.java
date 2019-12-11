package com.zhao.study.springaop1_3.service;

public class CityServiceImpl implements CityService {
    public void query() {
        System.out.println("query()--------------------");
    }

    public void query1(String aa) {
        System.out.println("query1()--------------------");
    }
}