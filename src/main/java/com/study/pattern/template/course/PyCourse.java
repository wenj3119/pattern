package com.study.pattern.template.course;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class PyCourse extends AbstractCourse{

    @Override
    protected void checkHomeWork() {
        System.out.println("检查python作业");
    }
}
