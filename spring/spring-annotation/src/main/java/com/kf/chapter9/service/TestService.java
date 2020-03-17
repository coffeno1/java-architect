package com.kf.chapter9.service;

import com.kf.chapter9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class TestService {
    /**
     * @Autowired表示默认优先按类型去容器中找对应的组件,
     * 相当于anno.getBean(TestDao.class)去容器获取id为testDao的bean,
     * 并注入到TestService的bean中;
     */
//    @Qualifier("testDao")   //加载指定的testDao
    @Autowired(required = false)      //默认去容器中找id为”testDao”的bean @Autowired注解里的属性默认required=true.必须找到bean

    /**
     *  JSR250规范
     *  @Resource和Autowired一样可以装配bean
        @Resource缺点: 不能支持@Primary功能
        不能支持@Autowired(required = false)的功能
     */
//    @Resource

    /**
     *  JSR330规范
     *  @Inject和Autowired一样可以装配bean, 并支持@Primary功能, 可用于非spring框架.
        @Inject缺点: 但不能支持@Autowired(required = false)的功能,需要引入第三方包javax.inject

     */
//    @Inject
    TestDao testDao;

    public void print(){
        System.out.println(testDao);
    }
}
