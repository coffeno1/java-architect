package com.kf.chapter4;

import com.kf.chapter1.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.kf.chapter2")
public class Config4Bean {
    /*
    配置类 等同于配置文件

    懒加载：主要针对单实例bean，默认在容器启动时创建对象
            容器启动时不创建，在第一次使用时，bean才创建初始化
     */
    @Lazy
    @Bean   //给容器注册一个Bean，类型为返回值的类型
    public Person person(){
        System.out.println("给容器中添加person.......");
        return new Person("jack",20);
    }
}
