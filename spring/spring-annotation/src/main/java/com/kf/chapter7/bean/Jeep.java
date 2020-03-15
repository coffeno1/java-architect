package com.kf.chapter7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 *实现InitializingBean 实现DisposableBean 来实现bean的初始化和销毁
 */
@Component
public class Jeep implements InitializingBean,DisposableBean {

    //当beanFactory创建好对象,且把bean所有属性设置好之后,会调这个方法,相当于初始化方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("jeep......afterPropertiesSet......");
    }
    //当bean销毁时,会把单实例bean进行销毁
    public void destroy() throws Exception {
        System.out.println("jeep.......destroy......");
    }
}
