package com.kf.chapter7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 使用JSR250规则定义的(java规范)两个注解来实现bean的初始化和销毁
 */
@Component
public class Train {
    public Train(){
        System.out.println("train........constructor......");
    }

    @PostConstruct
    public void init(){
        System.out.println("train........init......");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("train........destroy......");
    }
}
