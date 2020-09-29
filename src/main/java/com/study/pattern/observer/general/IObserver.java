package com.study.pattern.observer.general;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public interface IObserver <E>{
    void update(E e);
}
