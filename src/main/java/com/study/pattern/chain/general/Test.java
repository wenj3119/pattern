package com.study.pattern.chain.general;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);
        handlerA.handleRequest("requestB");
    }
}
