package com.study.pattern.observer.general;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public interface ISubject<E> {
    boolean attach(IObserver<E> e);
    boolean detach(IObserver<E> e);
    void notify(E e);
}
