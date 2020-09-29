package com.study.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new  EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);

        eventBus.post("jack");
    }
}
