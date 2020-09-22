package com.study.pattern.factory.abstractfactory;

/**
 * @Author wenjun
 * @Date 2020/9/16
 * @Description
 */
public class PyCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new PyNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new PyVideo();
    }
}
