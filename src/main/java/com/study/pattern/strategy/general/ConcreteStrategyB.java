package com.study.pattern.strategy.general;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class ConcreteStrategyB implements IStrategy{
    @Override
    public void algorithm() {
        System.out.println("Strategy B");
    }
}
