package com.study.pattern.factory.factorymethod;

/**
 * @Author wenjun
 * @Date 2020/9/16
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new PyCourseFactory();
        ICourse iCourse = factory.create();
        iCourse.record();
    }
}
