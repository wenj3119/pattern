package com.study.pattern.observer.general;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        IObserver observer = new ConcreteObserver();

        ISubject iSubject = new ConcreteSubject();
        iSubject.attach(observer);

        iSubject.notify(observer);
    }
}
