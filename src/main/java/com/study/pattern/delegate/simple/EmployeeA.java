package com.study.pattern.delegate.simple;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class EmployeeA implements IEmployee{
    protected String goodA = "编程";
    @Override
    public void doing(String task) {
        System.out.println("我是员工A,我擅长" + goodA + ",我现在开始干活" + task);
    }
}
