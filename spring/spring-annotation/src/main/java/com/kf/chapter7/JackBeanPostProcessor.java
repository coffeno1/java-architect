package com.kf.chapter7;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 *  bean的后置处理器,在bean初始化之前调用进行拦截,在bean初始化前后进行一些处理工作
    使用BeanPostProcessors如何控制Bean的生命周期
 */
@Component
public class JackBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..."+bean+"..."+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..."+bean+"..."+beanName);
        return bean;
    }
}
