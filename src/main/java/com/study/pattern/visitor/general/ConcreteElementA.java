package com.study.pattern.visitor.general;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class ConcreteElementA implements IElement{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return this.getClass().getSimpleName();
    }
}
