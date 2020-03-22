package com.kf.chapter10.config;

import com.kf.chapter10.aop.Calculate;
import com.kf.chapter10.aop.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class Config10Bean {
    @Bean
    public Calculate calculate(){
        return new Calculate();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
