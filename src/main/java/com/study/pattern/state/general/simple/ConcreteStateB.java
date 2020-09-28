package com.study.pattern.state.general.simple;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class ConcreteStateB implements IState{
    @Override
    public void handler() {
        System.out.println("处理B的行为");
    }
}
