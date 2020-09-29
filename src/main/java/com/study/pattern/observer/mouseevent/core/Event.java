package com.study.pattern.observer.mouseevent.core;

import java.lang.reflect.Method;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Event {
    //事件源，动作是由谁发出的
    private Object source;
    //事件触发，要通知谁（观察者）
    private Object target;
    //观察者给的回应
    private Method callBack;
    //事件的名称
    private String trigger;
    //事件的触发时间
    private long time;

    public Event(Object target, Method callBack) {
        this.target = target;
        this.callBack = callBack;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public Event setTarget(Object target) {
        this.target = target;
        return this;
    }

    public Method getCallBack() {
        return callBack;
    }

    public Event setCallBack(Method callBack) {
        this.callBack = callBack;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callBack=" + callBack +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
