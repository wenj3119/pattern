package com.study.pattern.delegate.simple;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class EmployeeB implements IEmployee{
    protected String goodB = "平面设计";
    @Override
    public void doing(String task) {
        System.out.println("我是员工B,我擅长" + goodB + ",我现在开始干" + task);
    }
}
