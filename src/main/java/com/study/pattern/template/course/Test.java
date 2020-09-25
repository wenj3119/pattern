package com.study.pattern.template.course;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("=========java==========");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomeWork(true);
        javaCourse.createCourse();

        System.out.println("=========python===========");
        PyCourse pyCourse = new PyCourse();
        pyCourse.createCourse();
    }
}
