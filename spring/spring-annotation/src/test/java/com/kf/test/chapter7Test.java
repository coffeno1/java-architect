package com.kf.test;

import com.kf.chapter7.bean.Config7Bean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class chapter7Test {
    @Test
    public void test01(){

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config7Bean.class);

        System.out.println("IOC容器创建完成.......");

        app.close();

    }
}
