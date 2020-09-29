package com.study.pattern.observer.mouseevent.handle;

import com.study.pattern.observer.mouseevent.core.EventObservable;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 * 具体的被观察者
 */
public class Mouse extends EventObservable {
    public void click(){
        System.out.println("调用单击方法");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void move(){
        System.out.println("调用移动方法");
        this.trigger(MouseEventType.ON_MOVE);
    }

}
