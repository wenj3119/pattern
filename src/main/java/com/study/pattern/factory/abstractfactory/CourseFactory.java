package com.study.pattern.factory.abstractfactory;

/**
 * @Author wenjun
 * @Date 2020/9/16
 * @Description
 */
public abstract class CourseFactory {
    public void init(){
        System.out.println("chushihua jichu shuju");
    }
    protected abstract INote createNote();
    protected abstract IVideo createVideo();
}
