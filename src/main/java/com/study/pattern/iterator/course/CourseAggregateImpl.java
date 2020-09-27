package com.study.pattern.iterator.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class CourseAggregateImpl implements ICourseAggregate{
    private List courseList;
    public CourseAggregateImpl(){
        this.courseList = new ArrayList();
    }
    @Override
    public void add(Course course) {
        this.courseList.add(course);
    }

    @Override
    public void remove(Course course) {
        this.courseList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<Course>(courseList);
    }
}
