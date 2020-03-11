package com.kf.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DemoDao {
    @Autowired
    DemoDao demoDao;
}
