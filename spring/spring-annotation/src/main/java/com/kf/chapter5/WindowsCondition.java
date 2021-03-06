package com.kf.chapter5;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {
    /*
    ConditionContext:判断条件能使用的上下文（环境）
    AnnotatedTypeMetadata：注解信息
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //TODO 判断是否是Windows系统

        //能获取到IOC容器使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //获取到类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        //获取到当前环境
        Environment environment = conditionContext.getEnvironment();
        //获取bean定义的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        String property = environment.getProperty("os.name");

        if (property.contains("Windows")){
            return true;
        }

        return false;
    }
}
