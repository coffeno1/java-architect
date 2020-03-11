package com.kf.chapter3;

import com.kf.chapter1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value = "com.kf.chapter2")
public class Config3Bean {
    /*
    配置类 等同于配置文件
    prototype: 多实例：IOC容器启动并不会去调用方法创建对象放在容器中，而是每次获取的时候才会调用方法创建对象
    singleton: 单实例（默认）：IOC容器启动会调用方法创建对象放到IOC容器中
    以后每交获取就是直接从容器（理解成从map.get对象）中拿
    request:  主要针对WEB应用，同一次请求创建一个实例
    session:  同一个session创建一个实例

     */
    @Scope("prototype")
    @Bean   //给容器注册一个Bean，类型为返回值的类型
    public Person person(){
        return new Person("jack",20);
    }
}
