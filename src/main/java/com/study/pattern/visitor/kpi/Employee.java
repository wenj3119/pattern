package com.study.pattern.visitor.kpi;

import java.util.Random;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public abstract class Employee {
    public String name;
    public int kpi;

    public Employee(String name){
        this.name = name;
        this.kpi = new Random().nextInt();
    }
    public abstract void accept(IVisitor visitor);
}
