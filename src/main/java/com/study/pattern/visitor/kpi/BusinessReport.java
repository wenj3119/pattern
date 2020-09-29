package com.study.pattern.visitor.kpi;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class BusinessReport {
    private List<Employee> employees = new LinkedList<>();
    public BusinessReport(){
        employees.add(new Manager("产品经理A"));
        employees.add(new Manager("产品经理B"));
        employees.add(new Engineer("工程师A"));
        employees.add(new Engineer("工程师B"));
        employees.add(new Engineer("工程师C"));
        employees.add(new Engineer("工程师D"));
        employees.add(new Engineer("工程师E"));
    }

    public void showReport(IVisitor visitor){
        for(Employee employee: this.employees){
            employee.accept(visitor);
        }
    }
}
