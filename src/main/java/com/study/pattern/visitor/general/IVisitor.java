package com.study.pattern.visitor.general;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public interface IVisitor {
    void visit(ConcreteElementA concreteElementA);
    void visit(ConcreteElementB concreteElementB);
}
