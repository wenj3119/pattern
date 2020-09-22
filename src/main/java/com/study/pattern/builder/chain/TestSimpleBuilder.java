package com.study.pattern.builder.chain;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class TestSimpleBuilder {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.addName("设计模式").addPpt("ppt").addVideo("录播").addHomeWork("work");
        System.out.println(builder.builder());
    }
}
