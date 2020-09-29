package com.study.pattern.visitor.general;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public interface IElement {
    void accept(IVisitor visitor);
}
