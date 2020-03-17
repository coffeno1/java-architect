package com.kf.test;

import com.kf.chapter8.bean.Bird;
import com.kf.chapter8.config.Config8Bean;
import com.kf.chapter9.config.Config9Bean;
import com.kf.chapter9.dao.TestDao;
import com.kf.chapter9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class chapter9Test {
    @Test
    public void test01(){

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config9Bean.class);

        TestService testService = app.getBean(TestService.class);
        testService.print();
        //从容器中获取testDao和使用Autowired注释的来比较
        TestDao testDao = app.getBean(TestDao.class);
        System.out.println(testDao);        //两个testDao的地址是一样的
        System.out.println("IOC容器创建完成.......");

        app.close();

    }
}
