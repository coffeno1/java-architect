package com.kf.chapter5;

import com.kf.chapter1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class Config5Bean {
    /*
    配置类 等同于配置文件
     */
    @Bean   //给容器注册一个Bean，类型为返回值的类型
    public Person person(){
        System.out.println("给容器中添加person.......");
        return new Person("person",20);
    }

    @Conditional(value = LinuxCondition.class)
    @Bean   //给容器注册一个Bean，类型为返回值的类型
    public Person james(){
        System.out.println("给容器中添加james.......");
        return new Person("james",20);
    }

    @Conditional(value = WindowsCondition.class)
    @Bean   //给容器注册一个Bean，类型为返回值的类型
    public Person jack(){
        System.out.println("给容器中添加jack.......");
        return new Person("jack",20);
    }
}
