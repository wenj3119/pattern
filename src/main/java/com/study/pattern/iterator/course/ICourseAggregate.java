package com.study.pattern.iterator.course;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public interface ICourseAggregate {
    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
