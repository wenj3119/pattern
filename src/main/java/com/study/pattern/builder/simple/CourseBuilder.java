package com.study.pattern.builder.simple;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class CourseBuilder {
    private Course course  = new Course();

    public void addName(String name){
        course.setName(name);
    }
    public void addPpt(String ppt){
        course.setPpt(ppt);
    }
    public void addVideo(String video){
        course.setVideo(video);
    }
    public void addHomeWork(String homeWork){
        course.setHomeWork(homeWork);
    }
    public Course builder(){
        return course;
    }
}
