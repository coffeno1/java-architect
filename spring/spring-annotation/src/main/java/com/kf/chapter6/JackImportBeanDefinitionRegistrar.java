package com.kf.chapter6;

import com.kf.chapter6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class JackImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        boolean b = registry.containsBeanDefinition("com.kf.chapter6.Cat");

        RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
        registry.registerBeanDefinition("pig", beanDefinition);
    }
}
