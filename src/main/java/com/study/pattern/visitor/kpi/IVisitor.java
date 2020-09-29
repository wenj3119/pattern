package com.study.pattern.visitor.kpi;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public interface IVisitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
