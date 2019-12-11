package com.zhao.study.springaop1_2;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ZhaoHandler implements InvocationHandler {
    //这个是原生对象（即我们的Service）
    private Object object;

    //给个构造方法
    public ZhaoHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("befor--------invoke----");
            return method. invoke(object, args);
    }
}
