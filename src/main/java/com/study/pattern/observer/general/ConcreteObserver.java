package com.study.pattern.observer.general;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class ConcreteObserver<E> implements IObserver<E>{
    @Override
    public void update(E e) {
        System.out.println("receive event: " + e);
    }
}
