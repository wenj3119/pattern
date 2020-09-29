package com.study.pattern.visitor.kpi;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("==========CEO看报表============");
        report.showReport(new CEOVisitor());
        System.out.println("===========CTO看报表=============");
        report.showReport(new CTOVisitor());
    }
}
