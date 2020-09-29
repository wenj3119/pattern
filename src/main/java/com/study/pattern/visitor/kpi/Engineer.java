package com.study.pattern.visitor.kpi;

import java.util.Random;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Engineer extends Employee{

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    public int getCodeLines(){
        return new Random().nextInt(100000);
    }
}
