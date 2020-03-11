package com.kf.chapter1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    /*
    配置类 等同于配置文件
     */
    @Bean("person01")   //给容器注册一个Bean，类型为返回值的类型
    public Person person(){
        return new Person("jack",20);
    }
}
