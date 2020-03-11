package com.kf.chapter2;

import com.kf.chapter1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "com.kf.chapter2",includeFilters = {
        @Filter(type = FilterType.CUSTOM,classes = JackTypeFilter.class)
        },useDefaultFilters = false)
public class Config2_2Bean {
    /*
    配置类 等同于配置文件
     */
    @Bean("person01")   //给容器注册一个Bean，类型为返回值的类型
    public Person person(){
        return new Person("jack",20);
    }
}
