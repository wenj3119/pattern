package com.study.pattern.delegate.general;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class ConcreteA implements Task{
    @Override
    public void doTask(String task) {
        System.out.println("我是A" + task);
    }
}
