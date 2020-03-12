package com.kf.chapter6;

import com.kf.chapter6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class JackFactoryBean implements FactoryBean<Monkey> {
    @Nullable
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Nullable
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
