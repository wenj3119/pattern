package com.study.pattern.visitor.dispatch.dymdispatch;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Person man = new Man();
        Person woman = new Woman();
        man.test();
        woman.test();
    }
}
