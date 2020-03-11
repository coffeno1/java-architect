package com.kf.test;

import com.kf.chapter3.Config3Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class chapter3Test {
    @Test
    public void test01(){
        //声明容器，将配置类Config3Bean加载到容器中
        ApplicationContext app = new AnnotationConfigApplicationContext(Config3Bean.class);
       //从容器中分别取两次person实例，看是否为同一个bean
        Object bean1 = app.getBean("person");
        Object bean2 = app.getBean("person");

        System.out.println(bean1 == bean2); //结论：为同一个bean，默认是单实例
    }
}
