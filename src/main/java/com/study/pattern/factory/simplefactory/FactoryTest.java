package com.study.pattern.factory.simplefactory;

/**
 * @Author wenjun
 * @Date 2020/9/16
 * @Description
 */
public class FactoryTest {
    public static void main(String[] args) {
        ICourse course = new CourseFactory().create(JavaCourse.class);
        course.record();
    }
}
