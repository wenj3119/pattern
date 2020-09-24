package com.study.pattern.adapter.general.objectadapter;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public int request() {
        return adaptee.specificRequest()/10;
    }
}
