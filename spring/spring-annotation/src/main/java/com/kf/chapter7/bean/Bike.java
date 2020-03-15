package com.kf.chapter7.bean;

import org.springframework.stereotype.Component;

public class Bike {
    public Bike(){
        System.out.println("bike......constructor");
    }
    public void init(){
        System.out.println("bike.......init.....");
    }

    public void destroy() {
        System.out.println("bike.......destroy.....");
    }
}
