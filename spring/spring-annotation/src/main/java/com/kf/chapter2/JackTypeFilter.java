package com.kf.chapter2;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import java.io.IOException;
import java.net.URI;

public class JackTypeFilter implements TypeFilter {
    /*
        自定义过滤规则类
        metadataReader:读取当前正在扫描类的信息
        metadataReaderFactory：可以获取到其他任何类的信息
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        String className1 = annotationMetadata.getClassName();
        System.out.println("+++++---------+++"+className1);
        //获取当前正在扫描的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类路径
        Resource resource = metadataReader.getResource();
        URI uri = resource.getURI();
        String className = classMetadata.getClassName();

        System.out.println("++++++++"+uri);
        System.out.println("--------"+className);

        return false;
    }
}
