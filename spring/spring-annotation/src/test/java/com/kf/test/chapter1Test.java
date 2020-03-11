package com.kf.test;

import com.kf.chapter1.ConfigBean;
import com.kf.chapter1.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class chapter1Test {

    @Test
    public void test01(){
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        Person person = app.getBean(Person.class);
        System.out.println(person);
    }

    @Test
    public void test02(){
        ApplicationContext app = new AnnotationConfigApplicationContext(ConfigBean.class);
        Person person = app.getBean(Person.class);

        System.out.println(person.getName());
        /*
        类型默认为方法名
        可以通过@Bean("自定义类名")设置类名或者修改方法名
         */
        String[] names = app.getBeanNamesForType(Person.class);
        for(String name:names){
            System.out.println(name);
        }
    }

}
