package com.study.pattern.proxy.general;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("real service is called");
    }
}
