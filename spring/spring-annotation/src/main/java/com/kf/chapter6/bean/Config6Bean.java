package com.kf.chapter6.bean;

import com.kf.chapter1.Person;
import com.kf.chapter6.JackFactoryBean;
import com.kf.chapter6.JackImportBeanDefinitionRegistrar;
import com.kf.chapter6.JackImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = {Dog.class,Cat.class, JackImportSelector.class, JackImportBeanDefinitionRegistrar.class})
@Configuration
public class Config6Bean {
    /*
    配置类 等同于配置文件
     */
    @Bean   //给容器注册一个Bean，类型为返回值的类型
    public Person person(){
        System.out.println("给容器中添加person.......");
        return new Person("person",20);
    }

    /**
     * 给容器中注册组件
     * 1.包扫描+组件标注注解（@Controller @Service @Repository @Component）一般是针对自己写的类
     * 2.@Bean [导入第三方类或包的组件，比如Person类为第三方，需要在我们IOC容器中使用]
     * 3.@Import[快速给容器导入一个组件] 注：@Bean 有点简单
     *      a.@Import(要导入到容器中的组件)：容器中会自动注册这个组件，id默认是全类名
     *      b.ImportSelector：是一个接口，返回需要导入的组件的全类名数组
     *      c.ImportBeanDefinitionRegistrar： registerBeanDefinitions(),通过调用此方法可以手动添加组件到IOC容器。所有
     *          Bean可以使用BeanDefinitionRegistry进行注册；
     * 4.使用spring提供的FactoryBean（工厂bean）
     *      容器调用getObject()返回对象，把对象放到容器中；
     *      getObjectType()返回对象类型
     *      isSingleton()是否单例进行控制
     */

    @Bean
    public JackFactoryBean jackFactoryBean(){
        return new JackFactoryBean();
    }
}
