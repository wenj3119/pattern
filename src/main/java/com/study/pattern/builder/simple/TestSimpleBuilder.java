package com.study.pattern.builder.simple;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class TestSimpleBuilder {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.addName("设计模式");
        builder.addPpt("ppt");
        builder.addVideo("录播");
        builder.addHomeWork("work");
        System.out.println(builder.builder());
    }
}
