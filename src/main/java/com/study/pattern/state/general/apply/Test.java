package com.study.pattern.state.general.apply;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handler();
    }

}
