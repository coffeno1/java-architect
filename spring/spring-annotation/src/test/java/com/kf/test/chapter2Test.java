package com.kf.test;

import com.kf.chapter2.Config2Bean;
import com.kf.chapter2.Config2_2Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class chapter2Test {
    @Test
    public void test01(){
        //声明容器，将配置类Config2Bean加载到容器中
        ApplicationContext app = new AnnotationConfigApplicationContext(Config2Bean.class);
        //获取类名称
        String[] names = app.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
    }

    @Test
    public void test02(){
        //声明容器，将配置类Config2Bean加载到容器中
        ApplicationContext app = new AnnotationConfigApplicationContext(Config2_2Bean.class);
        //获取类名称
        String[] names = app.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
    }
}
