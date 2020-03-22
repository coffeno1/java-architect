package com.kf.chapter9.config;

import com.kf.chapter9.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan({"com.kf.chapter9.controller","com.kf.chapter9.service","com.kf.chapter9.dao","com.kf.chapter9.bean"})
@Configuration
public class Config9Bean {

    @Primary    //primary加载优先级最高
    @Bean("testDao2")
    public TestDao testDao(){
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }

}
