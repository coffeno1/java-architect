package com.kf.test;

import com.kf.chapter6.bean.Config6Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class chapter6Test {
    @Test
    public void test01(){

        ApplicationContext app = new AnnotationConfigApplicationContext(Config6Bean.class);

        System.out.println("IOC容器创建完成.......");

        String[] names = app.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }

    }
}
