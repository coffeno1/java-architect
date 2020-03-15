package com.kf.chapter7.bean;

import com.kf.chapter1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.kf.chapter7")
@Configuration
public class Config7Bean {

    @Bean
    public Person person(){
        System.out.println("给容器中添加person.......");
        return new Person("person",20);
    }

    /**
     对于单实例的bean, 可以正常调用初始化和销毁方法
     对于多实例的bean,容器只负责初始化, 但不会管理bean, 容器关闭时不会调用销毁方法
     * @return
     */
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Bike bike(){
        return new Bike();
    }

}
