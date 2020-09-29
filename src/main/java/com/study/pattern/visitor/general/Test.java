package com.study.pattern.visitor.general;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        System.out.println("========A访问者======");
        structure.accept(new ConcreteVisitorA());

        System.out.println("=========B访问者==========");
        structure.accept(new ConcreteVisitorB());
    }
}
