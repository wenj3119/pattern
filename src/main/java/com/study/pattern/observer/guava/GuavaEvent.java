package com.study.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class GuavaEvent {
    @Subscribe
    public void observer(String str){
        System.out.println("执行observer方法，参数为：　" + str);
    }
}
