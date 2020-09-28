package com.study.pattern.state.general.apply;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class ConcreteStateA extends State {
    @Override
    public void handler() {
        System.out.println("处理Ａ的行为");
        this.context.setState(Context.STATE_B);
        this.context.getState().handler();
    }
}
