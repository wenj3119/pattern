package com.study.pattern.prototype.general;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Jack");
        System.out.println(prototype);
        //拷贝原型对象
        ConcretePrototype cloneType = prototype.clone();
        System.out.println(cloneType);
    }
}
