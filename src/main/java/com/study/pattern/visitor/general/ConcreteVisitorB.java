package com.study.pattern.visitor.general;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class ConcreteVisitorB implements IVisitor{
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        String result = concreteElementA.operationA();
        System.out.println("result from " + concreteElementA.getClass().getSimpleName() + ": " + result);
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        String result = concreteElementB.operationB();
        System.out.println("result from " + concreteElementB.getClass().getSimpleName() + ": " + result);
    }
}
