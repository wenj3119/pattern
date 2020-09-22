package com.study.pattern.factory.abstractfactory;

/**
 * @Author wenjun
 * @Date 2020/9/16
 * @Description
 */
public class JavaCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
