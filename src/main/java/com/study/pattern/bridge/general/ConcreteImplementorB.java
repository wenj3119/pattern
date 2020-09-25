package com.study.pattern.bridge.general;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class ConcreteImplementorB implements IImplementor{
    @Override
    public void operationImpl() {
        System.out.println("我是B");
    }
}
