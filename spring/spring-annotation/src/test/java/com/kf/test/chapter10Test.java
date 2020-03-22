package com.kf.test;

import com.kf.chapter10.aop.Calculate;
import com.kf.chapter10.config.Config10Bean;
import com.kf.chapter9.config.Config9Bean;
import com.kf.chapter9.dao.TestDao;
import com.kf.chapter9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class chapter10Test {
    @Test
    public void test01(){

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config10Bean.class);

        Calculate calculate = app.getBean(Calculate.class);
        calculate.div(4,3);

        app.close();

    }
}
