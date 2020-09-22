package com.study.pattern.prototype.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = ConcretePrototype.getInstance();
        prototype.setAge(18);
        prototype.setName("Jack");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("打球");
        hobbies.add("游戏");
        prototype.setHobbies(hobbies);
        System.out.println(prototype);
        //拷贝原型对象
        ConcretePrototype cloneType = prototype.deepCloneObject();
        cloneType.getHobbies().add("学习");
        System.out.println("拷贝前对象：　" + prototype);
        System.out.println("拷贝后对象：　" + cloneType);
        System.out.println(prototype == cloneType);

        System.out.println("原型对象的爱好：　" + prototype.getHobbies());
        System.out.println("拷贝对象的爱好：　" + cloneType.getHobbies());
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());
    }
}
