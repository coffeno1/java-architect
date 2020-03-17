package com.kf.chapter8.config;

import com.kf.chapter8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import sun.awt.SunHints;

@PropertySource(value = {"classpath:/test.properties"}) //将test.properties配置文件加载起来
@Configuration
public class Config8Bean {

    @Bean
    public Bird bird(){
        return new Bird();
    }

}
