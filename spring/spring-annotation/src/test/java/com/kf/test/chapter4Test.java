package com.kf.test;

import com.kf.chapter3.Config3Bean;
import com.kf.chapter4.Config4Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class chapter4Test {
    @Test
    public void test01(){
        //声明容器，将配置类Config3Bean加载到容器中
        ApplicationContext app = new AnnotationConfigApplicationContext(Config4Bean.class);

        System.out.println("IOC容器创建完成.......");

        app.getBean("person");

    }
}
