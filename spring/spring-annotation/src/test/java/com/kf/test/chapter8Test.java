package com.kf.test;

import com.kf.chapter8.bean.Bird;
import com.kf.chapter8.config.Config8Bean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class chapter8Test {
    @Test
    public void test01(){

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config8Bean.class);

        Bird bird = (Bird) app.getBean("bird");
        System.out.println(bird);

        ConfigurableEnvironment environment = app.getEnvironment();
        String property = environment.getProperty("bird.color");
        System.out.println("bird.color======"+property);
        System.out.println("IOC容器创建完成.......");

        app.close();

    }
}
