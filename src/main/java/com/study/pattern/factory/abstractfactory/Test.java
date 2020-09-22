package com.study.pattern.factory.abstractfactory;

/**
 * @Author wenjun
 * @Date 2020/9/16
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}