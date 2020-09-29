package com.study.pattern.visitor.kpi;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class CEOVisitor implements IVisitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：　" + engineer.name + "kpi：　" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：　" + manager.name + "kpi: " + manager.kpi +"产品数量：　" + manager.getProducts());
    }
}
