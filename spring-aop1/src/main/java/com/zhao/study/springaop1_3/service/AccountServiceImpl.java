package com.zhao.study.springaop1_3.service;

import com.zhao.study.springaop1_3.MyAnnotation;
import org.springframework.stereotype.Service;

@Service
@MyAnnotation
public class AccountServiceImpl implements AccountService {
    @Override
    public void query() {
        System.out.println("query()--------------------");
    }
    @Override
    public void query1(String aa,int bb) {
        System.out.println("query1()--------------------");
    }
    @Override
    @MyAnnotation
    public void setQuery() {
        System.out.println("setQuery()--------------------");
    }
}