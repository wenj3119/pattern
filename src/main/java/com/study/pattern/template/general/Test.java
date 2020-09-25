package com.study.pattern.template.general;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        AbstractClass abc = new ConcreteClassA();
        abc.templateMethod();
        abc = new ConcreteClassB();
        abc.templateMethod();
    }
}
