package com.study.pattern.state.general.simple;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class ConcreteStateA implements IState{
    @Override
    public void handler() {
        System.out.println("处理Ａ的行为");
        Context.STATE_B.handler();
    }
}
