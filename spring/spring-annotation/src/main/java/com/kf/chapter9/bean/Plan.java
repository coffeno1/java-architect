package com.kf.chapter9.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Plan implements ApplicationContextAware {
    ApplicationContext applicationContext;

    public Plan(){
        System.out.println("Plan........constructor");
    }

    //对象创建并赋值后调用
    @PostConstruct
    public void init(){
        System.out.println("Plan........PostConstruct");
    }

    //容器移除对象之前回调通知，销毁bean
    @PreDestroy
    public void destroy(){
        System.out.println("Plan........PreDestroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("当前IOC容器" + applicationContext);
        this.applicationContext = applicationContext;
    }
}
