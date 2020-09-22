package com.study.pattern.builder.general;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Director {
    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder();
        System.out.println(builder.build());
    }
}
