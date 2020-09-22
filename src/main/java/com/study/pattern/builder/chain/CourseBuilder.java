package com.study.pattern.builder.chain;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class CourseBuilder {
    private Course course  = new Course();

    public CourseBuilder addName(String name){
        course.setName(name);
        return this;
    }
    public CourseBuilder addPpt(String ppt){
        course.setPpt(ppt); return this;
    }
    public CourseBuilder addVideo(String video){
        course.setVideo(video); return this;
    }
    public CourseBuilder addHomeWork(String homeWork){
        course.setHomeWork(homeWork); return this;
    }
    public Course builder(){
        return course;
    }
}
