package com.study.pattern.iterator.course;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
