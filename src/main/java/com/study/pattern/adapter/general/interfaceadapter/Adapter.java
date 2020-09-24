package com.study.pattern.adapter.general.interfaceadapter;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public  class Adapter implements Target{
    protected Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public int request1() {
        return 0;
    }

    @Override
    public int request2() {
        return 0;
    }

    @Override
    public int request3() {
        return 0;
    }

    @Override
    public int request4() {
        return 0;
    }
}
