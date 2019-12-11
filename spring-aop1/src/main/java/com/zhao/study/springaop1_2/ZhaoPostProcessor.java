package com.zhao.study.springaop1_2;


import com.zhao.study.springaop1_2.service.CityService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

//@Component
public class ZhaoPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //这里要写实现类的名字，否则这个方法会加载所有类代理
        if(beanName.equals("cityServiceImpl")){
            //返回代理后的Object
            return Proxy.newProxyInstance(ZhaoPostProcessor.class.getClassLoader(),new Class[]{CityService.class},new ZhaoHandler(bean));
        }
        return null;
    }
}
