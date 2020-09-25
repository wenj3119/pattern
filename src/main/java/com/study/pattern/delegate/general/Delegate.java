package com.study.pattern.delegate.general;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class Delegate implements Task{

    @Override
    public void doTask(String task) {
        new ConcreteA().doTask(task);
        new ConcreteB().doTask(task);
    }
}
