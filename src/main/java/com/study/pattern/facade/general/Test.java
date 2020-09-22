package com.study.pattern.facade.general;

/**
 * @Author wenjun
 * @Date 2020/9/22
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}
