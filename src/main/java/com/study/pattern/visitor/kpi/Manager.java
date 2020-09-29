package com.study.pattern.visitor.kpi;

import java.util.Random;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Manager extends Employee{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProducts(){
        return new Random().nextInt(10);
    }
}
