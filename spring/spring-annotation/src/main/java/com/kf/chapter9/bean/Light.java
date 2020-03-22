package com.kf.chapter9.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Light implements ApplicationContextAware,BeanNameAware,EmbeddedValueResolverAware {
    ApplicationContext applicationContext;
    @Override
    public void setBeanName(String s) {
        System.out.println("当前bean的名称" + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("传入的IOC容器" + applicationContext);
        this.applicationContext = applicationContext;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        //解析器
        String result = stringValueResolver.resolveStringValue("当前操作系统的名称${os.name},计算值#{3*8}");
        System.out.println(result);
    }
}
