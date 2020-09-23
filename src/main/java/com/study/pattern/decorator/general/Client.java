package com.study.pattern.decorator.general;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();

        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operation();
        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);
        decoratorBandA.operation();
    }
}
