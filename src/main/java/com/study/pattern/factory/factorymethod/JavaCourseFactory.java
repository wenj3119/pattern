package com.study.pattern.factory.factorymethod;

/**
 * @Author wenjun
 * @Date 2020/9/16
 * @Description
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
