package com.kf.chapter10.aop;

public class Calculate {
    public int div(int i,int j){
        System.out.println("业务方法执行.......");

        int result = i/j;

        return result;
    }
}
