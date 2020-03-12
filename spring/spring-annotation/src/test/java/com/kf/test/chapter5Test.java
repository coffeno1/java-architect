package com.kf.test;

import com.kf.chapter5.Config5Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class chapter5Test {
    @Test
    public void test01(){

        ApplicationContext app = new AnnotationConfigApplicationContext(Config5Bean.class);

        System.out.println("IOC容器创建完成.......");

    }
}
