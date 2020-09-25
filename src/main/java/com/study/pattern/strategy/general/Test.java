package com.study.pattern.strategy.general;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        IStrategy strategy = new ConcreteStrategyA();

        Context context = new Context(strategy);
        context.algorithm();

        context = new Context(new ConcreteStrategyB());
        context.algorithm();
    }
}
