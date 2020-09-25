package com.study.pattern.bridge.general;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Abstraction r = new RefinedAbstraction(new ConcreteImplementorA());
        r.operation();
        r = new RefinedAbstraction(new ConcreteImplementorB());
        r.operation();
    }

}
